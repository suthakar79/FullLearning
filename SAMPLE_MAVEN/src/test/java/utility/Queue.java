package utility;

public class Queue<T> {
	private static class Node<T>{
		T data;
		Node <T> next;
		public Node(T data){this.data=data;}
	}
	Node<T> front,rear;
	public void enqueue(T value){
		Node<T> current=new Node(value);
		if(front==null && rear==null){
			front=current;
			rear=current;}
		else
		{
			rear.next=current;
			rear=current;
		}
		
	}
	public void display()
	{
		Node <T> current=front;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		
	}
	public Node<T> Dequeue()
	{
		Node<T> current=front;
		front=front.next;
		System.out.println("Dequeued Item : "+current.data);
		return current;
		
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		for(int i=0;i<=5;i++)
		q.enqueue(i);
		q.display();
		q.Dequeue();
	}

}
