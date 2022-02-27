package utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayIntersection {
    public static void main(String args[]) {
        int myArray1[] = {23, 36, 96, 78, 55};
        int myArray2[] = {78, 45, 19, 78, 55};
        System.out.println("Intersection of the two arrays ::");
        List<int[]> a1=new ArrayList<>(Arrays.asList(myArray1));
        List<int[]> a2=new ArrayList<>(Arrays.asList(myArray2));
        a1.retainAll(a2);
        Iterator<int[]> itr=a1.iterator();
        while(itr.hasNext()){
           System.out.println(itr.next());}
        
        // String str="Java is program";
        // String remove="apm";
        // String result=str.replaceAll("a","").replaceAll("p", "").replaceAll("m", "");           
        // System.out.println(result);
     }

    
}



