package utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
	 public static void main(String[] args)
	    {  
	        //Initialize array  
	        int [] arr = new int [] {1, 2, 3, 4, 2, 2, 8, 8, 3,1};
	        int j=0;
	        Set<Integer> duplicateElement=new HashSet<Integer>();
	        Arrays.sort(arr);
	       
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  O(n)
	       
	        for(int i = 0; i < arr.length-1; i++)
	            {  
	                if(arr[i] != arr[i+1]) 
	                arr[j++]=arr[i];
	                else
	                	duplicateElement.add(arr[i+1]);	
	            }  
	            arr[j++]=arr[arr.length-1];
	            for(int i=0;i<j;i++)
	              System.out.println(arr[i]);
	            System.out.println("Duplicate Elements are : "+duplicateElement);
	                
	            
	         
	    }  

}
