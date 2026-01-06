package treeCreation;

public class InorderTraversal 
{
	public static class Node
	{
		int data; 
		Node left;
		Node right;
		public Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	} 
	public static void inorderTraversal(Node node)
	{
		//Base case
		if(node==null) return;
		inorderTraversal(node.left);
		System.out.print(node.data+" ");
		inorderTraversal(node.right);
	}
	

	public static void main(String[] args) 	
	{
		Node root=new Node(7);
		root.left=new Node(5);
		root.left.left=new Node(3);
		root.left.right=new Node(6);
		root.left.left.left=new Node(1);
		root.left.left.right=new Node(4);
		root.right=new Node(12);
		root.right.left=new Node(9);
		root.right.left.left=new Node(8);
		root.right.left.right=new Node(10);
		root.right.right=new Node(15);
		root.right.right.left=new Node(13);
		root.right.right.right=new Node(17);
		inorderTraversal(root);
		
	}

}
