import java.util.*;
import java.lang.*;
import java.io.*;

class LongestIncreasingSubsequence{
	public static void main (String[] args) {
	    
	    LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
      int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
      System.out.println("Length of lis is " + lis.lis(arr) + "\n" ); 
    }
	
	
	int lis(int[] arr){
  
	    int n = arr.length;
	    int[] l = new int[n];
	    
	    for(int i=0;i<n;i++)
	        l[i]=1;
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(arr[i]>arr[j]){
	                l[i]=l[i]<l[j]+1?l[j]+1:l[i];
	            }
	        }      
	    }
	    return max(l);
	}
	
	int max(int[] l){
	    int max=0;
	    for(int i=0;i<l.length;i++)
	        max=Math.max(l[i],max);
	
	    return max;
	} 
	
}
