package utility;

public class printnumberinwords {
//     String[] one = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
// //string type array for two digits numbers    
// //the first index is empty because it makes indexing easy   
// String[] two = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
// //string type array of tens multiples   
// //the first two indexes are empty because it makes indexing easy   
// String[] three = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
// //string type array of power of tens   
// String[] four = new String[] {"Hundred", "Thousand"};  
// String [] arr={"one","two","three","four"};
static String [][] digits={
    {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"},
    {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"},
    {"Zero",  "one", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"},
    {"Zero","Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred"},
    {"Zero","Thousands","Two Thousands","Three Thousands","Four Thousands","Five Thousands","Six Thousands","Seven Thousands"},
};

public static String convertword(int n){
     // 4568
    int count=String.valueOf(n).length();
    StringBuffer sb=new StringBuffer();
    for(char c:String.valueOf(n).toCharArray()){
        if(count!=2 && Character.getNumericValue(c)!=1)
        {sb.append(digits[count][Character.getNumericValue(c)]+" ");
              count=count==2?--count:count;  }   
        count--;
    }
    return sb.append(" only").toString();

}
 public static void main(String args[])   {
    System.out.println(convertword(4528));

 }
}
