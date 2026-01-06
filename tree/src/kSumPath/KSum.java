package kSumPath;

import java.util.*;

public class KSum 
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
	
	static int sum=0;
	static int count=0;
	
	public static void findPath(Node root, int k,ArrayList<Integer> path,int sum)
	{
		
		
		if(root==null)
		{
			return;
		}
		path.add(root.data);
		sum+=root.data;
		
	
		if(sum==k)
		{
			count++;
			System.out.println(path);
		}
		
		findPath(root.left, k,path,sum);
		findPath(root.right, k,path,sum);
		path.remove(path.size()-1);
	}

	public static void main(String[] args) 
	{
		Node root=new Node(1);
		root.left=new Node(3);
		root.left.left=new Node(2);
		root.left.right=new Node(1);
		root.right=new Node(-1);
		root.right.left=new Node(4);
		root.right.left.left=new Node(1);
		root.right.left.right=new Node(2);
		root.right.right=new Node(5);
		root.right.right.right=new Node(6);
		
		int k=5;
		System.out.println("K sum path =");
		ArrayList<Integer> path=new ArrayList<>();
		findPath(root,k,path,0);
		System.out.println(count);

	}

}
