package utility;

import java.util.Scanner;

public class String_length_withoutUsinglengthFunction {
    public static void main(String args[]){
        try (//Find the length of the string without using length function 
        Scanner sc = new Scanner(System.in)) {
            String str1=sc.nextLine().toLowerCase();
            int count=1;
            char [] str=str1.toCharArray();
            for(char c:str){count++;}
           
            //str.charAt(count)>'a' && str.charAt(count)<'z' || Character.isWhitespace(String.valueOf(str.charAt(count)
            // while(Character.isAlphabetic(str[count]) || Character.isLetterOrDigit(str[count]) || Character.isWhitespace(str[count])){
            //     count++;
            // }
            System.out.println("the length of the string is :"+count);

        }
    
    }
    
}
