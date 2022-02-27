package utility;

import java.util.Scanner;

public class RemoveDuplicateletter {
    public static void main(String args[])
    {
        String word,word1;
        Scanner sc=new Scanner (System.in);
      //Removing the duplicate from the sentences  or word too
       System.out.println("Enter the input string");
       word1=sc.nextLine();
       char [] word2=word1.toLowerCase().toCharArray();
       StringBuilder sb1=new StringBuilder(word2.length);
       for(int j=0;j<word2.length;j++){
          for(int i=j+1;i<word2.length-1;i++)
        {
            if(word2[j]==word2[i] && word2[i]!='$' )
                    word2[i]='$';

        }
        if(word2[j]!='$')
            sb1.append(word2[j]);
    }
    System.out.println("the output after removing the duplicated is "+sb1);
    
}
}
