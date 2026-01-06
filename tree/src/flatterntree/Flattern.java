package flatterntree;

import java.util.*;

public class Flattern 
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
	
	public static void flattern(Node root)
	{
		Node curr=root;
		while(curr!=null)
		{
			if(curr.left!=null)
			{
				Node pre=curr.left;
				while(pre.right!=null && pre.right!=curr)
				{
					pre=pre.right;
				}
				//connect right
				pre.right=curr.right;
				
				//move left subtree to right
				curr.right=curr.left;
				curr.left=null;
				
			}
			
			curr=curr.right;
			
		}
		
	}
	
	public static void printFlattern(Node root)
	{
		Node curr=root;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.right;
		}
		
	}

	public static void main(String[] args) 
	{
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(4);
		root.right=new Node(5);
		root.right.right=new Node(6);
		flattern(root);
		printFlattern(root);
		
		

	}

}
