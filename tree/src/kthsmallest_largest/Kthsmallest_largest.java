package kthsmallest_largest;


import java.util.*;

public class Kthsmallest_largest 
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
	static int count=0;
	static int ans=-1;
	Node root;
	public static void kthSmallest(Node root,int k)
	{
		//inorder traversa
		if(root==null)return;
		kthSmallest(root.right,k);
		count++;
		if(count==k)
		{
			ans=root.data;
			System.out.println("kth largest = "+ans);
			return;
		}
		
		
		if(root==null)return;
		kthLargest(root.left, k);
		kthSmallest(root.right, k);
		
	}
	
	public static void kthLargest(Node root,int k)
	{
		//reverese inorder traversal
		if(root==null)return;
		kthLargest(root.left, k);
		count++;
		if(count==k)
		{
			ans=root.data;
			System.out.println("kth smallest = "+ans);
			return;
		}
		kthLargest(root.left,k);
		
	}
	
	//insert method
	public static Node insert(Node root,int key)
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
	
		
	public static void main(String[] args) 
	{
		Node root=null;
		int [ ]value= {5,3,8,24,10};
		for(int v :value)
		{
			root=insert(root,v);
			
			
		}
		int k=3;
		count=0;
		ans=-1;
		kthLargest(root, k);
		kthSmallest(root, k);
		
		
	}

}
