package utility;
import java.util.*;
import java.util.HashMap;
public class Amazonprogram {
//Given an array S of n integers, find the pair with the largest difference.
//	{1,2,3,6,9}
	public static void main(String[] args) 
	{
	    int s[]={1,2,3,6,9};
		int size =s.length;
	    int differnce[]=new int[size*size];
	    int count=0,j=0;
	    Map<Integer,String> map=new HashMap<>();
	    
	    for(int i=0;i<size;i++){
	    	for(j=0;j<size;j++){
	        differnce[count]=s[i]-s[j];// calculate the difference and store in Array
	        map.put(differnce[count],String.valueOf(s[i])+","+String.valueOf(s[j]));
	        count++;
	    }
	    }
	    Arrays.sort(differnce);
	    for(int i=0;i<differnce.length;i++)
	    	System.out.print(differnce[i]+"  ");
	    System.out.println("The Largest difference pair :"+map.get(differnce[count-1]));

		Map<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("apple", 4);
		int x=map1.get("apple");
		map1.put("apple",x+3);
		System.out.println(map1);
	    
	}

	
}
