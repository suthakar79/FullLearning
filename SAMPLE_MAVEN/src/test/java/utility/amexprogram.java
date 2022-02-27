package utility;

public class amexprogram
{
  public static void main(String args[])
  {
       String s ="876879s43s8767v";
       for(int i=0;i<s.length();i++)
       {
            if(Character.isDigit(s.charAt(i)))
            {
            int x=Character.getNumericValue(s.charAt(i));
            for(int j=1;j<=x;j++)
            System.out.print(x);
            }
        else{
        System.out.println("it is character "+s.charAt(i));
            }
    }


    }
    
    
}
