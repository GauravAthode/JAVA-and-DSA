package morrisinordertraversal;

import java.util.*;

public class Morris 
{
	static class Node 
	{
	    int data;
	    Node left, right;
	    Node(int value) 
	    {
	        data = value;
	        left = right = null;
	    }
	}
	
	public static void inorder(Node root)
	{
		Node curr=root;
		while(curr!=null)
		{
			if(curr.left==null)
			{
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
			else 
			{
				//find predecessor
				Node pre=curr.left;
				while(pre.right!=null && pre.right!=curr)
				{
					pre=pre.right;
				}
				if(pre.right==null)
				{
					pre.right=curr;
					curr=curr.left;
				}
				else 
				{
					pre.right=null;
					System.out.print(curr.data+" ");
					curr=curr.right;
					
				}
				
			}
		}
	}

	public static void main(String[] args) 
	{
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(30);
		root.left.left=new Node(-2);
		root.left.left.right=new Node(2);
		root.left.right=new Node(6);
		root.left.right.right=new Node(8);
		root.left.left.right.left=new Node(-1);
		root.right.right=new Node(40);
		inorder(root);

	}

}
