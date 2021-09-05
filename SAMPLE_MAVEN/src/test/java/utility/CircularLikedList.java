package utility;

public class CircularLikedList <T> {
	private static class Node <T>{
		T data;Node <T> next;
		public Node(T data){this.data=data;}
			}// end of class Node
	public Node<T> last;
	public void insertAtlast(T value){
		Node<T> current=new Node(value);
		if(last==null) // creating first node
		{
			last=current;//main point here 
			last.next=last;
		}
		else{
		current.next=last.next;
		last.next=current;
		last=current;}
				
	}
	public void display(){
		
		if(last==null)
			System.out.println("The List is Empty");
		else if(last.next==null)
			System.out.println(last.data+"->");
			
		else
		{
			Node<T> first=last.next;
			while(first!=last){
				System.out.print(first.data+"->");
				first=first.next;
				}
			System.out.print(first.data);
		}
	}
	
	public void insertAtbeginning(int value){
		Node<T> current=new Node(value);
		if(last==null) // creating first node
		{
			last=current;
			last.next=last;
		}
		else{
		current.next=last.next;
		last.next=current;}
				
	}
	@SuppressWarnings("unchecked")
	public static <T>  void main(String[] args) {
		CircularLikedList cl=new CircularLikedList();
		cl.display();
//		for(int i=1;i<5;i++)
//		cl.insertAtlast(i);
		
		for(int i=1;i<5;i++)
			cl.insertAtbeginning(i);
		cl.display();
	}

}
