import java.util.*;
import java.lang.*;
import java.io.*;

class LongestCommonSubsequence{
	public static void main (String[] args) {
	    LongestCommonSubsequence lcs = new LongestCommonSubsequence(); 
        String s1 = "AGGTAB"; 
        String s2 = "GXTXAYB"; 
  
        char[] X=s1.toCharArray(); 
        char[] Y=s2.toCharArray(); 
        System.out.println("Length of LCS is" + " " + 
                                  lcs.longestCommonSubsequence( X, Y) ); 
	
	}

	int longestCommonSubsequence(char[] X, char[] Y){
	    int m = X.length; 
        int n = Y.length; 
        
        int[][] L = new int[m+1][n+1];
        int i,j;
        
        for(i=0;i<=m;i++){
            for(j=0;j<=n;j++){
                
                if(i==0||j==0)
                    L[i][j]=0;
                else if(X[i-1]==Y[j-1])
                    L[i][j]=L[i-1][j-1]+1;
                else
                    L[i][j]=Math.max(L[i][j-1],L[i-1][j]);
                } 
                       
            }
		
	i=m;
	j=n;
	
	StringBuffer s = new StringBuffer();
		
	while(i>0 && j>0){
		if(X[i-1]==Y[j-1]){
		    s.insert(0,Character.toString(X[i-1]));
		    i--;
		    j--;
		}
		else{
		    if(L[i][j-1]>L[i-1][j])
		        j--;
		    else
		        i--;
		    }
			
	}
	
	System.out.println(s);
        
        return L[m][n];
	}
	
}
