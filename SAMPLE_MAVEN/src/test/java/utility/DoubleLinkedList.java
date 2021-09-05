/**
 * 
 */
package utility;

/**
 * @author suthakar79
 * @param <T>
 *
 */
public class DoubleLinkedList<T>  {

	/**
	 * @param args
 */
	private static class Node <T>{
		T data;Node <T> next,pre;
		public Node(T data){this.data=data;}
			}// end of class Node
	public Node<T> head;
	public Node<T> Previous;
	public Node<T> NEXT;
	public void insertAtBeginning(T value){
		Node<T> newNode=new Node<T>(value);
		head.pre=newNode;
		newNode.next=head;
		head=newNode;
		}
	
	public void display(){
		Node<T> current=head;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print(current);	
	}
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList<T> dl=new DoubleLinkedList();
		dl.head=new Node(1);
		for(int i=1;i<3;i++)
		dl.insertAtBeginning((T)new Integer(i));
		for(double i=1.2;i<3.2;i++)
			dl.insertAtBeginning((T)new Double(i));
		dl.insertAtBeginning((T) new String("RAVI"));
		dl.display();
		
		
	}

}
