package utility;
import java.util.Scanner;
public class CBREjavaprogram
{
public static void main(String args[])
{
  int mat[][] ={  {1,2,3,0},
                        {4,5,6,0},
                        {7,8,9,0}
                       };
System.out.println("Enter the number to find position");
Scanner sc=new Scanner(System.in);
float input=sc.nextFloat();
for(int i=0;i<3;i++)
{
 for(int j=0;j<4;j++)
  {
    if(input==mat[i][j])
      System.out.println(" the position found at "+i+","+j+" for input "+input);
	}//End of J 
	}
	
}
}
