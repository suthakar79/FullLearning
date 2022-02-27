package utility;

public class BinaryTree <T>{
	public static class TreeNode <T>{
		int  data;
		TreeNode left,right;
		TreeNode(int data){this.data=data;this.left=null;this.right=null;}
	} //end of TreeNode
	TreeNode root;
	
	BinaryTree(){
		root=null;
	}
	
	public  void insert(int value){
		TreeNode<T> newnode=new TreeNode<T>(value);
		
		if(root==null)
			root=newnode;
		else if(value<=root.data){
			if(root.left==null)
				root.left=newnode;
		//	else
		}	
		else {
			if(root.right==null)
				root.right=newnode;
//			else
//				insert(root.right,value);
		}
		
	}//End of insert method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
