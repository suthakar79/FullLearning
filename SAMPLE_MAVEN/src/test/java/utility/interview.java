package utility;

import java.util.Arrays;

class Alpha
{
    public String type = "a ";
    public Alpha() {  System.out.println("alpha "); }
    {System.out.println("instance initializer base class block invoked"); }
    static {System.out.println("static block from Class Alpha derved"); }
}
public class interview extends Alpha
{
    String type = "bus ";
    public interview()  {  System.out.println("beta ");  }
    static {
        System.out.println("static block from Class Interview derved");
    }
    {System.out.println("instance initializer derived block invoked");} 
  
    void go()
    {
        String type = "b ";
        System.out.print(this.type + super.type );
        System.out.print("Local variable type "+type);
    }
  
    public static void main(String[] args)
    {
       new interview().go();
      
        String string = "Hardships often prepare ordinary people for an extraordinary destiny"; 
        String string1=string+" ";
        String word[]=string1.split(" ");
        for(String x :word){
                System.out.println(x);
        }
        try{
        System.out.println(word[0]+"  "+word[word.length-1]);
        Arrays.sort(word);
        System.out.println(word[0]+"  "+word[word.length-1]);
        }
        finally{
            
        }
        
    }
}

