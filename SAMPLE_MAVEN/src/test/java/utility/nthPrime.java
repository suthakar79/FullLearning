package utility;

import java.util.*;


public class nthPrime {

    public static boolean isprime(int x)
    {
        for(int i=2;i<=x/2;i++){
            if(x%i==0)
            return false;
         }
        return true;
    
    }
    public static void main(String...args){
        List<Integer> prime=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=2;i<z*z;i++)
        {
            if(isprime(i))
            prime.add(i);
        }
        
        System.out.println("Nth prime number is "+prime+prime.get(z-1));
        
    }

}
