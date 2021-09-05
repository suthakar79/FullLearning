package utility;

import java.util.Arrays;

public class printing {
	
	static void removeDuplicate(int a[])
	{
		int t[]=new int[a.length];
		int j=0;
		for(int k=0;k<a.length;k++){
		for(int i=k+1;i<a.length-1;i++){
			if(a[k]==a[i])
				a[i]=-1;
		}
		if(a[k]!=-1)
			t[j++]=a[k];
		}
		
		for(int i=0;i<j-1;i++){
			a[i]=t[i];
		System.out.println(a[i]);}
	}
	
//	static void minMaxword(){
//		String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
//	      String word = "", small = "", large="";    
//	      String[] words = new String[100];    
//	      int length = 0;    
//	          
//	      //Add extra space after string to get the last word in the given string    
//	      string = string + " ";    
//	          
//	      words=string.split("\\s"); 
//	      //Initialize small and large with first word in the string 
//	      Arrays.sort(words.toString());
//	      small = words[0];    
//	      large = words[words.length-1];  
//	      
//	      System.out.println("Smallest word: " + small);    
//	      System.out.println("Largest word: " + large);    
//	  }    
	
	static void minMaxChars(){
		    
		      String str = "grass green";    
		      int[] freq = new int[str.length()];    
		      char minChar = str.charAt(0), maxChar = str.charAt(0);    
		      int i, j, min, max;            
		          
		      //Converts given string into character array    
		      char string[] = str.toCharArray();    
		          
		      //Count each word in given string and store in array freq    
		      for(i = 0; i < string.length; i++) {    
		          freq[i] = 1;    
		          for(j = i+1; j < string.length; j++) {    
		              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
		                  freq[i]++;    
		                      
		                  //Set string[j] to 0 to avoid printing visited character    
		                  string[j] = '0';    
		              }    
		          }    
		      }    
		          
		      //Determine minimum and maximum occurring characters    
		      min = max = freq[0];    
		      for(i = 0; i <freq.length; i++) {    
		              
		          //If min is greater than frequency of a character     
		          //then, store frequency in min and corresponding character in minChar    
		          if(min > freq[i] && freq[i] != '0') {    
		              min = freq[i];    
		              minChar = string[i];    
		          }    
		          //If max is less than frequency of a character     
		          //then, store frequency in max and corresponding character in maxChar    
		          if(max < freq[i]) {    
		              max = freq[i];    
		              maxChar = string[i];    
		          }    
		      }    
		          
		      System.out.println("Minimum occurring character: " + minChar);    
		      System.out.println("Maximum occurring character: " + maxChar);    
		    
	}
	static void NumberHalfTriangle(int n) 
    { 
        // sp stands for space 
        // st stands for number 
        int sp = n / 2, st = 1; 
        System.out.println("print Number in half Triangle pattern");
        // Outer for loop for number of lines 
        for (int i = 1; i <= n; i++) { 
  
            // Inner for loop for printing space 
            for (int j = 1; j <= sp; j++) 
                System.out.print(" "); 
  
            // Inner for loop for printing number 
            int count = st / 2 + 1; 
            for (int k = 1; k <= st; k++) { 
                System.out.print(count); 
                if (k <= st / 2) 
                    count--; 
                else
                    count++; 
            } 
  
            // To goto next line 
            System.out.println(); 
            if (i <= n / 2) { 
  
                // sp decreased by 1 
                // st increased by 2 
                sp = sp - 1; 
                st = st + 2; 
            } 
  
            else { 
  
                // sp increased by 1 
                // st decreased by 2 
                sp = sp + 1; 
                st = st - 2; 
            } 
        } 
    } 
	
	void printHalfTriangle(int n){
		System.out.println("print Half Triangle pattern");
		int k = 0;
        for (int i=0; i<n; i++) 
        { 
        	if(i<=n/2){
        		for (int j=n-i; j>1; j--) 
                System.out.print(" ");
        		for (int m=0; m<i; m++ ) 
                { 
                    // printing stars 
                    System.out.print("* "); 
                } 
        		}
        	else{
        		for(k=1;k<i;k++){ 
                    System.out.print(" ");}
        		for (int m=0; m<n-i; m++ ) 
                { 
                    // printing stars 
                    System.out.print("* "); 
                } 
        		}
            // ending line after each row 
            System.out.println(); 
        } 
      
    	
    }
	static void printPattern(int n)  
	{  
	    int var1, var = 1;  
	    System.out.println("print Number in zizgag pattern"); 
	    for(int i = 1; i <= n; i++)  
	    {  
	        // for odd rows  
	        if(i % 2 != 0)  
	        {  
	            // calculate starting value  
	            var = var + i - 1;  
	            for(int j = 1; j <= i; j++)  
	            {  
	                if(j == 1)  
	                {  
	                    System.out.print(var);  
	                }  
	                else
	                System.out.print("*" + var);  
	                      
	            var++;  
	            }  
	        }  
	        else // for even rows  
	        {      
	            var1 = var + i -1; // calculate starting value  
	            for(int j = 1; j <= i; j++)  
	            {  
	                if(j == 1)  
	                {  
	                    // print without star  
	                    System.out.print(var1);  
	                }  
	                else
	                {  
	                    // print with star  
	                    System.out.print("*" + var1);  
	                }  
	                var1--;  
	            }  
	        }  
	        System.out.print("\n");  
	    }  
	      
	}
	public void display(int x){
		int K=1;
		for(int i=1;i<=Math.ceil(x/2);i++)
		{
		System.out.println("\n");	
		for(int j=1;j<=i;j++){
			if(K<=x){ 
				System.out.print(K++ +" ");}}
		}
		
		}
	public void printTriagle(int n) 
    { 
        // outer loop to handle number of rows 
        //  n in this case 
		System.out.println("print Number in Triangle pattern");
		int k;
        for (int i=0; i<=n-1; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
        	for (int j=2*n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
//            if(i>Math.ceil(n/2))
//            	k=n-i;
//            else{
//            	k=i;
//            	 
//            }
            for (int m=0; m<=i; m++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
        
    } 
	public static void main(String args[])
	{
		int a[]={1,2,1,7,2,3,7};
		printing p= new printing();
		//printing.removeDuplicate(a);
		//printing.minMaxword();
//		p.display(16);
		//p.printTriagle(7);
		p.printHalfTriangle(10);
//		printing.printPattern(8);
//		printing.NumberHalfTriangle(6);
	}
	}

