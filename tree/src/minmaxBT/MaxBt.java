package minmaxBT;

import java.util.*;

import bstIncertion.BSTInsertion.Node;

public class MaxBt 
{
	static class Node 
	{
	    long data;
	    Node left, right;
	    Node(int value) 
	    {
	        data = value;
	        left = right = null;
	    }
	}
	public Node insert(Node root, int key )
	{
		if(root == null)
		{
			root = new Node(key) ;
			return root;
		}
		
		if(key<root.data)
		{
			root.left = insert(root.left,key);
		}
		
		else if(key>root.data)
		{
			root.right = insert(root.right, key);
		}
			
		return root;
		
		
	}
	public static int findMin(Node root)
	{
		if(root==null)
		{
			System.out.println("Tree is empty");
			return -1;
		}
		while(root.left!=null)
		{
			root=root.left;
		}
		return root.data;
	}
	public static int findMax(Node root)
	{
		if(root==null)
		{
			System.out.println("Tree is empty");
			return -1;
		}
		while(root.right!=null)
		{
			root=root.right;
		}
		return root.data;
	}

	public static void main(String[] args)
	{
		Node root=null;
		int []vallue= {8,3,10,1,6,14,4,7,13};
		for(int val:value)
		{
			root=Insert(root,val);
		}

	}

}
