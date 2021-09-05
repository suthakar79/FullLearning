package utility;

import java.util.Stack;

public class TreeNode <T>{
		int  data;
		TreeNode left,right;
		TreeNode(int data){this.data=data;}
		static int level=0;
		public  void insert(int value){
			
			if(value<=data){
				if(left==null)
					left=new TreeNode<T>(value);
				else
					left.insert(value);}
			else {
				if(right==null)
				right=new TreeNode<T>(value);
				else
					right.insert(value);
			}
			
		}//End of insert method
		
		public void printInOrderTree(){//recursive method
			//Left,root,Right
			if(left!=null)
				left.printInOrderTree();
			System.out.print(data+"-->");
			if(right!=null)
					right.printInOrderTree();
			
		}
		
		public void printinOrderNonRecursive(TreeNode root)//Non recursive method
		{
			System.out.print("print Nonrecursive method");
			//Ref : https://www.youtube.com/watch?v=uMTrIjP_0Gw&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=57
			Stack<TreeNode> stack=new Stack<TreeNode>();
			TreeNode temp=root;
			while(!stack.isEmpty() ||temp!=null)
			{
				if(temp!=null){
					stack.push(temp);
					temp=temp.left;}
				else{
					temp=stack.pop();
					System.out.print(temp.data+" ");
					temp=temp.right;
				}
				
			}
			
		}
		
		public void printpreOrderNonRecursive(TreeNode root)//Non recursive method
		{
			System.out.print("print Nonrecursive method-Preorder");
			//Ref : https://www.youtube.com/watch?v=uMTrIjP_0Gw&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=55
			Stack<TreeNode> stack=new Stack<TreeNode>();
			TreeNode temp=root;
			stack.push(temp);
			//need to implement based on the above video
			
		}
		public void printPostOrderTree(){//recursive method
			//Left,Right,root this way for Traversal
			if(left!=null)
				left.printInOrderTree();
			if(right!=null)
					right.printInOrderTree();
			System.out.print(data+"-->");
		}
		public void printPreOrderTree(){//recursive method
			//root,left,Right
			System.out.print(data+"-->");
			if(left!=null)
				left.printInOrderTree();
			if(right!=null)
					right.printInOrderTree();
			
		}
		public boolean contains(int value){
			boolean bFound=false;
			if(data==value)
				return true;
			else if(value<data){
				if(left==null)
					return false;
				else	
				return left.contains(value);}
			else{
				if(right==null)
					return false;
				else
				return right.contains(value);}
			
			
		}
		public TreeNode <T> minnode(TreeNode<T> t){
			
			if(t.left!=null)
				return minnode(t.left);
			else						
				return t;
			
		}
		TreeNode parent=this;
		
		public void deleteNode(int value){
			
			if(value<data){
				parent=this;
				left.deleteNode(value);}
			else if(value>data)
			{
				parent=this;
				right.deleteNode(value);
			}
				
			else
				//value matched with data
			{
				if(left==null&&right==null) {
					parent=null;
				} else if(left==null){//node had one right child
				    data=right.data;
				    right=null;}
				else if(right==null){//node had one left child
					data=left.data;
					left=null;}
				else //node had both left and right child find minvalue from right subtree
				{
					TreeNode NewNode=minnode(right);
					data=NewNode.data;
					right=null;
									
				}
					
			}
		}
		
		 public boolean isSameLevel(int currentLevel ) { 
			 
			    
		            if(this==null)  
		                return true;  
		  
		            if(left == null && right == null) {  
		                //If first leaf is encountered, set level to current level  
		                if(level == 0) {  
		                    level = currentLevel ;  
		                    return true;  
		                }  
		                //Checks whether the other leaves are at same level of that of first leaf  
		                else  
		                   return (level == currentLevel) ;  
		             }  
		  
		            //Checks for leaf node in left and right subtree recursively.  
		            return  (left.isSameLevel(currentLevel + 1) && right.isSameLevel(currentLevel + 1)) ;  
		         }  
		     
	public static <T> void main(String[] args) {
		
		TreeNode<T> root=new TreeNode(1);
		root.insert(2);
		root.insert(3);
		root.insert(4);
		root.insert(5);
		root.insert(6);
		root.insert(7);
		System.out.println("Inorder Traversal");
		root.printInOrderTree();
		System.out.println("\nPostorder Traversal");
		root.printPostOrderTree();
		System.out.println("\npreOrder Traversal");
		root.printPreOrderTree();
		System.out.println("search ");
		System.out.println(root.contains(8));
		System.out.println(root.contains(10));
		root.printinOrderNonRecursive(root);
		root.deleteNode(5);//leftmost node only not working and remaning is working
		root.printInOrderTree();
		if(root.isSameLevel(1))
			System.out.println("All leaves are at same level");
		else
			System.out.println("All leaves are not at same level");
	}

}
