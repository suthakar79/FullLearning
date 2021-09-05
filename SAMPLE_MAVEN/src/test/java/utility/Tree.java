package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree {
		int  data;
		Tree left,right;
		
		Tree(int data){this.data=data;}
		static int max=0;
		static int  leftheight=0;
		static int rightheight=0;
		
public static void main(String[] args) {
		//compare two binary Tree inorder traversal are equal or not 
				
				Tree tree1=new Tree(5);
				tree1.left=new Tree(3);
				tree1.left.left=new Tree(1);
				tree1.right=new Tree(7);
				tree1.right.left=new Tree(6);
				
				Tree tree2=new Tree(3);
				tree2.left=new Tree(1);
				tree2.right=new Tree(6);
				tree2.right.left=new Tree(5);
				tree2.right.right=new Tree(7);
//				Tree tree2=new Tree(5);
//				tree2.left=new Tree(3);
//				tree2.left.left=new Tree(12);
//				tree2.right=new Tree(7);
//				tree2.right.left=new Tree(16);
//				tree2.right.left.right=new Tree(12);
				List<Integer> list1=new ArrayList<Integer>();
				List<Integer> list2=new ArrayList<Integer>();
				//inordertravesal(tree1,list1);
				//inordertravesal(tree2,list2);
				//printinOrderNonRecursive(tree1,list1);
				if(tree1!=null)
					tree1.inordertravesal(list1);
				//printinOrderNonRecursive(tree2,list2);
				System.out.println(list1);
//				System.out.println(list2);
//				System.out.println("Inorder traversal : "+list1.equals(list2));
//				//verify two tree are identical or not
//				System.out.println("Tree Identical : "+areIdenticalTrees(tree1,tree2));
//				System.out.println("Max value  : "+max(tree2));
//				System.out.println("Max Height of tree  : "+maxheight(tree2));
				deleteNode(tree1, 1);
				printinOrderNonRecursive(tree1,list2);
				System.out.println("After Delete node : "+list2);
	}
public static List<Integer> inordertravesal(Tree tree,List<Integer> list){
	
	if(tree!=null) {
		if(tree.left!=null)
			inordertravesal(tree.left, list);
		list.add(tree.data);
		if(tree.right!=null)
			inordertravesal(tree.right,list);
	}
	return list;
	
	}


//another way to call inorder traversal without passing tree as parameters
public  List<Integer> inordertravesal(List<Integer> list){
		if(left!=null)
			left.inordertravesal(list);
		list.add(data);
		if(right!=null)
			right.inordertravesal(list);
	return list;
	}

public static int max(Tree tree){//maximum node value of the given tree
	
	if(tree!=null) {
		if(max<tree.data)
			max=tree.data;
		if(tree.left!=null)
			max(tree.left);
		
		if(tree.right!=null)
			max(tree.right);
	}
	return max;
	}
public static int maxheight(Tree tree){//maximum height  value of the given tree
	
	if(tree!=null) {
		
		if(tree.left!=null){
			leftheight++;
			maxheight(tree.left);
		}
				
		if(tree.right!=null){
			rightheight++;
			maxheight(tree.right);
		}
		return(Math.max(leftheight,rightheight));
			
	}
	return max+1;//Added 1 for root element 
	
		
		
	}
public static  void printinOrderNonRecursive(Tree root,List<Integer> list)//Non recursive method
{
	System.out.print("print Nonrecursive method");
	//Ref : https://www.youtube.com/watch?v=uMTrIjP_0Gw&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=57
	Stack<Tree> stack=new Stack();
	Tree temp=root;
	while(!stack.isEmpty() ||temp!=null)
	{
		if(temp!=null){
			stack.push(temp);
			temp=temp.left;}
		else{
			temp=stack.pop();
			System.out.print(temp.data+" ");
			list.add(temp.data);
			temp=temp.right;
			}
		
	}
	
}
	
public static boolean areIdenticalTrees(Tree root1, Tree root2) {  
	  
    //Checks if both the trees are empty  
    if(root1 == null && root2 == null)  
        return true;  

    //If both trees are not empty, check whether the data of the nodes is equal  
    //Repeat the steps for left subtree and right subtree  
    if(root1 != null  && root2 != null) {  

        return ((root1.data == root2.data) &&  
                (areIdenticalTrees(root1.left, root2.left)) &&  
                (areIdenticalTrees(root1.right, root2.right)));  
    }  
    return false;
}  	
public static Tree minnode(Tree t){
	
	if(t.left!=null)
		return minnode(t.left);
	else						
		return t;
}

public static void deleteNode(Tree tree ,int value){
	if(value<tree.data){
		deleteNode(tree.left,value);}
	else if(value>tree.data)
		deleteNode(tree.right,value);
	else
		//value matched with data
	{
		if(tree.left==null&&tree.right==null) {
			tree=null;
		} else if(tree.left==null){//node had one right child
			tree.data=tree.right.data;
			tree.right=null;}
		else if(tree.right==null){//node had one left child
			tree.data=tree.left.data;
			tree.left=null;}
		else //node had both left and right child find minvalue from right subtree
		{
			Tree NewNode=minnode(tree.right);
			tree.data=NewNode.data;
			tree.right=null;
							
		}
			
	}
}
	
}


