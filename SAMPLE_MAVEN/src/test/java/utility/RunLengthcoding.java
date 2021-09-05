package utility;

public class RunLengthcoding {
	
	public String encoding(String S)
	{
		int count=1;
		StringBuilder sb=new StringBuilder();
		char[] input=S.toCharArray();
		char prechar='0';
		for(char c:input){
			if(prechar==c)
				count++;
			else{
				if(prechar!='0')
					sb.append(count).append(prechar);
			prechar=c;
			count=1;}
			}
		
		
			sb.append(count).append(prechar);
			return sb.toString();
		}
		public String decode(String sb){
			int count = 1;
			char a[]=sb.toCharArray();
			StringBuilder s=new StringBuilder();
			for(char c: a)
			{
			 if(Character.isDigit(c))
				 count=Integer.parseInt(String.valueOf(c));
			 if(Character.isLetter(c))
				 for(int i=1;i<=count;i++)
					s.append(c) ;
			
			 
			}
			return s.toString();
			
		}
	

	public static void main(String[] args) {
		RunLengthcoding re=new RunLengthcoding();
		String result=re.encoding("Waaabbbccc");
		System.out.println(result);
		String result1=re.decode(result);
		System.out.println(result1);
		
	}

}
