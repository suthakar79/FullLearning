public class karatExcesise {

  static String toCamelCase(String s){
    
    if(s.indexOf("-")>0)
     String [] str= s.split("-");
    else if(s.indexOf("_")>0)
       s.split("_");
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<str.length;i++)
      {
     
      if(i!=0)
       sb.append(Character.toUpperCase(str[i].charAt(0))+str[i].substring(1).toLowerCase());
      else
       sb.append(str[i]);
    }

    return sb.toString();
  }
    
   public static void main(String[] args) {
     
    String s1="Zdadgygklabcd";
      StringBuilder sb=new StringBuilder();
      String s=s1.toLowerCase();
      for(int i=0;i<s.length();i++){
        sb.append(Character.toUpperCase(s.charAt(i)));
        for(int j=1;j<=i;j++)
         sb.append(s.charAt(i));
        
        if(i<s.length()-1)
        sb.append("-");
      }
      System.out.println(sb.toString());
      System.out.println(karatExcesise.toCamelCase("abc_dsfs_dasda-s1"));
    }
}