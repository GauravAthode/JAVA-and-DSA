package kthsmallest_largest;

import java.util.*;

public class Morriskthsmallest 
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
	
		
	public static int kthSmallest(Node root,int k)	
	{
		int count =0;
		int ans=-1;
		Node curr=root;
		while(curr!=null)
		{
			if(curr.left==null)
			{
				count++;
				if(count==k)
				{
					ans=curr.data;
					
				}
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
					count++;
					if(count==k)
					{
						ans=curr.data;
					}
					curr=curr.right;
					
				}
				
			}
		}
		return ans;
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
		int [ ]value= {5,3,8,2,4,10};
		for(int v :value)
		{
			root=insert(root,v);
				
		}
		int k=4;
		int result=kthSmallest(root, k);
		System.out.println(result);
		
		

	}

}
