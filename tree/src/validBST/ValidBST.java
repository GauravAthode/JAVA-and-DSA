package validBST;

import java.util.*;

public class ValidBST 
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
	
	
	
	public static boolean isvalidBST(Node root)
	{
		return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
		
	}
	
	public static boolean helper(Node root,long min,long max)
	{
		if(root==null)
		{
			return true;
		}
		//check current node is in range or not
		if(root.data <= min||root.data >= max)
		{
			return false;
		}
		return helper(root.left, min, root.data)&&helper(root.right, root.data, max);
	}

	public static void main(String[] args) 
	{
		Node root=new Node(5);
		root.left=new Node(3);
		root.left.left=new Node(2);
		root.right=new Node(8);
		root.right.right=new Node(10);
		
		if(isvalidBST(root))
		{
			System.out.println("yes it is");
			
		}
		else 
		{
			System.out.println("no it's not");
			
		}
	}
}
