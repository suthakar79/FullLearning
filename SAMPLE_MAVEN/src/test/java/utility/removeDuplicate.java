package utility;

import java.util.ArrayList;
import java.util.List;
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
	            
	            System.out.println("Duplicate Elements removed using for loop  : "+duplicateElement);

		
		  } 

		  //substract a array from b 

		  public static int[] arrayDiff(int[] a, int[] b) 
		  {
			List <Integer> list = new ArrayList<Integer>();
			loop:
			for (int num : a) {
				for (int i : b) if (num == i) continue loop;
				list.add(num);
			}
			return list.stream().mapToInt(Integer::intValue).toArray();
			
			//listA.stream().mapToInt(e -> e).toArray();
		  }

}
