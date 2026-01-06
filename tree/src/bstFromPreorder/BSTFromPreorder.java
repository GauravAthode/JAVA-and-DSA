package bstFromPreorder;

import java.util.*;

public class BSTFromPreorder 
{
	static class Node
	{
		int data;
		Node left,right;
		public Node(int data) 
		{
			this.data = data;
			left = right = null;
		}
	}
	
    Node root;
	
	//insert method
	
	Node insert(Node root,int key)
	{
		if(root==null)
		{
			return new Node(key);
			
		}
		if(key<root.data)
		{
			root.left=insert(root.left, key);
		}
		else
		{
			root.right=insert(root.right, key);
		}
		return root;
	}
	
	Node constructBST(int []preorder)
	{
		Node root=null;
		for(int key:preorder)
		{
			root=insert(root,key);	
		}
		return root;
	}
	void inorder(Node root)
	{
		if(root !=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}

	public static void main(String[] args) 
	{
		BSTFromPreorder tree=new BSTFromPreorder();
		int []preorder= {50,30,20,40,70,60,80};
		Node root=tree.constructBST(preorder);
		tree.inorder(root);
		
	}

}
