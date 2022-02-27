package utility;

import java.util.Scanner;

public class singleLinkedList<T> {

private static class Node <T>{
	private T data;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	private Node next;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node(T item){
		this.setData(item);
		this.next=null;
	}
	
	}//End of NODE class
	public Node<T> head;
	public int size=0;
	public void display(){
			Node<T> current=(Node<T>) head;
			while(current!=null){
				System.out.print(current.getData()+"-->");
				current=current.next;}
			System.out.print(current);
			}
	
	public void  removeDuplateFromSortedLL(){// this function works only from sorted Linked List
		Node<T> current=head;
		while(current!=null&&current.next!=null){
			if(current.data==current.next.data)
				current.next=current.next.next;
			else
				current=current.next;
		}
		size--;
	}
	
	public void InsertNodeIntoSortedLL(T data){// this function used to insert Node into Sorted Linked List
		Node  newNode=new Node(data); 
		Node current= head;
		Node pre = null;
		while((int)current.data < (int)newNode.data){
			pre=current;current=current.next;
		}
		newNode.next=pre.next;
		pre.next=newNode;
		
		size++;
			}
	public void Insertatbeginning(T data){
		Node <T> newNode=new Node(data); 
		newNode.next=head;
		head=newNode;
		size++;
			}

	public void InsertAtPosition(T data,int position){
		Node <T> newNode=new Node(data);
		Node <T> current=traverse(position);
		newNode.next=current.next;
		current.next=newNode;
		size++;
		}
	public void InsertAtLast(int data){
		Node <T> newNode=new Node(data);
		//Node <T> current=traverse(size+1);
		//Another logic traverse the node upto Next is null
		Node <T> current=head;
		while(current.next!=null){//Traverse till end of Last node which has NULL
			current=current.next;}
		//newNode.next=current.next;
		current.next=newNode;
		size++;
		}
	public void removeElement(int data){
		Node <T> current=head;
		Node <T> pre = null;
		boolean bFound=false;
		if(size==0)
			System.out.println("The List is Empty and can't the element ");
		else {
			//found whether node is existing in the list or not 
			while(current!=null){
				if((int)current.getData()==data){bFound=true;break;}
				pre=current;
				current=current.next;}
				}
		if(bFound)
		 pre.next=current.next;
		else
			System.out.println("The node element is not present in the list");
	}
	public Node <T> searchElement(int data){
		Node <T> current=head;
		boolean bFound=false;
		if(size==0)
			System.out.println("The List is Empty");
		else {
			
			while(current!=null){
				if((int)current.getData()==data)
					{bFound=true;System.out.println("The List has element");break;}
				current=current.next;}
				}
		return current;
		
	}
	public Node <T> traverse(int pos){
		Node <T> current=head;
		for(int i=0;i<pos-1;i++)
			current=current.next;
		return current;
		
	}
	public Node <T> reverse(){
		Node <T> Pre=null;
		Node <T> current=head;
		Node <T> Next=null;
		while(current!=null)
		{
			Next=current.next;
			current.next=Pre;
			Pre=current;
			current=Next;}
		return Pre;
		}
	
	public void deleteLastNode(){
		
		Node <T> current=head;
		Node <T> Next=null;
		while(current.next.next!=null){
		current=current.next;}
			current.next=null;
			}
	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		singleLinkedList list=new singleLinkedList();
		list.searchElement(88);
		list.head=new Node(0);
//		Node<T> first=new  Node(0);
//		Node<T> second=new  Node(1);
//		Node<T> third=new  Node(2);
		for(int i=1;i<=3;i++)
			list.Insertatbeginning(i);
		
		list.display();	
		System.out.println("\nDelete Last node");
		list.deleteLastNode();
		list.display();
		System.out.println("InsertAtbeginning");
		list.InsertAtLast(3);
		list.removeDuplateFromSortedLL();
		list.InsertAtPosition(77, 2);
		System.out.println("\nInsertAtPosition");
		list.display();	
		list.InsertAtLast(99);
		System.out.println("\nInsertAtLast");
		list.display();
		System.out.println("\nsearch element 77");
		list.searchElement(77);
		System.out.println("search element 88");
		if(list.searchElement(88)==null);
		System.out.println("Not found");
		System.out.println("Remove Element 77");
		list.removeElement(77);list.display();
		System.out.println("Remove element 66");
		list.removeElement(66);
		System.out.println("Reverse Linked List");
		list.head=list.reverse();
		list.display();
		
//		first.next=second;
//		second.next=third;
		
		//first=list.Insertatbeginning(first, 25);
		//list.display(first);
		
		
	}

}
