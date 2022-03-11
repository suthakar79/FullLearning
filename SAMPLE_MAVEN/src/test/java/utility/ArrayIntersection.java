package utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayIntersection {
    public static void main(String args[]) {
        Integer myArray1[] = {23, 36, 96, 78, 55};
        List<Integer> a1=Arrays.asList(myArray1);
        Integer myArray2[] = {23, 46, 66, 78, 55};
        List<Integer> a2=Arrays.asList(myArray2);
        System.out.println("Intersection of the two arrays ::");
       // a1.retainAll(a2);
        Iterator<Integer> itr=a1.iterator();
        while(itr.hasNext()){
           System.out.println(itr.next());}
        /**** Converting a Primitive 'int' Array to List **** using Java Stream **/
        int intArray[] = {1, 2, 3, 4, 5};
        List<Integer> integerList1 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println("List #1: " + integerList1);
     }

    
}



