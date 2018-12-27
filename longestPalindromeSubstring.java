import java.util.*;

class Solution {
    public String longestPalindrome(String s) {
        
        int len = s.length();
        if(len==0 || len==1)
            return s;
        
        int max=1;
        
        char[] X = s.toCharArray();
        int[][] table= new int[len][len];
        int i,j;
        
        for(i=0;i<len;i++)
            table[i][i]=1;
        
        for(i=0;i<len-1;i++){
            if(X[i]==X[i+1]){
                table[i][i+1]=1;
                max=2;    
            }
        }
        
        for(int k=3;k<=len;k++){
            for(i=0;i<len-k+1;i++){
                j=i+k-1;
                if(X[i]==X[j] && table[i+1][j-1]==1){
                    table[i][j]=1;
                    max=k;
                }
                else
                    table[i][j]=0;
            }
        }
        
        for(i=0;i<len;i++){
            if(table[i][i+max-1]==1){
                return s.substring(i,i+max);
            }       
        }
        
       return null;
        
    }
}
