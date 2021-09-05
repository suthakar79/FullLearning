package utility;

public class stack<T> {
	
	private static class Node<T>
	{
		T data;Node <T> next;
		public Node(T data){this.data=data;this.next=null;}
	}
	
	Node<T> top;
	public void push(T value){
		Node<T> node =new Node(value);
		if(top==null)
			top=node;
		else{
			node.next=top;//main point here 0<--1<--2<--3 ( top points to 3)
			top=node;
			}
	}
	
	public <T> void pop()
	{
		if(top==null)
			System.out.println("The stack is empty");
		else{
			System.out.println("Poped data : "+top.data);
			top=top.next;
		}
		
	}
	public void display()
	{
		Node <T> current=top;
		while(current!=null){
			System.out.print(current.data+"<--");
			current=current.next;
	 }
		System.out.println(current);
	}
	public static void main(String[] args) {
		stack s=new stack();
		for(double j=1.2;j<8.9;j++)
		s.push(j);
		s.display();
		s.pop();
		s.display();
		
	}

}
