package utility;
import java.util.Scanner;

public class LongPalindromfromSentence {
    public static void main(String...args)
    {    
    Scanner sc=new Scanner(System.in);
    String sstr=sc.nextLine(); // getting input from user
    String longPalindromeWord="";
    String [] word =sstr.split(" ");// Split the sentence into word 
    int longest=0;
    for(String Word:word){
        StringBuffer word1=new StringBuffer(Word);
        
        //word1.reverse().toString()
        if(Word.equalsIgnoreCase(findReverse(Word))){
          if(Word.length()>longest)
           {
            longest=Word.length();
            longPalindromeWord=Word;
           }

        }
           


    
    }
    System.out.println("Long Palindrom word from String : "+longPalindromeWord+" Length of the Palindrom :"+longest);
}
public static String findReverse(String str)
    {
    StringBuffer sb=new StringBuffer();
    for(int i=str.length()-1;i>=0;i--)
    {
        sb.append(str.charAt(i));
    }
    return sb.toString();
    }

}



