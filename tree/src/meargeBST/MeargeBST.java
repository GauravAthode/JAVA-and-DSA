package meargeBST;

import java.util.*;

public class MeargeBST 
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
	
	//inorder
	
	public static void inorder(Node root,ArrayList<Integer> arr)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left, arr);
		arr.add(root.data);
		inorder(root.right, arr);
		
		
		
	}
	
	
	//merge Array
	public static ArrayList<Integer> mergeArray(ArrayList<Integer>arr1,ArrayList<Integer>arr2)
	{
		ArrayList<Integer>merged=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<arr1.size()&&j<arr2.size())
		{
			if(arr1.get(i)<arr2.get(j))
			{
				merged.add(arr1.get(i));
				i++;
			}
			else 
			{
				merged.add(arr2.get(j));
				j++;	
			}
		}
		while(j<arr1.size())
		{
			merged.add(arr2.get(j));
			j++;
		}
		
		return merged;
	}
	//balanced bst from sorted array to bst
	public static Node sortedarraytoBST(ArrayList<Integer> merge,int s,int e)
	{
		if(s>e)
		{
			return null;
		}
		int mid=(s+e)/2;
		Node root=new Node(merge.get(mid));
		root.left=sortedarraytoBST(merge, s, mid-1);
		root.right=sortedarraytoBST(merge, mid+1, e);
		return root;
		
	}
	
	public static void printInorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	//merge Bst
	
	public static Node meargeBST(Node root1,Node root2)
	{
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		inorder(root1,arr1);
		inorder(root2,arr2);
		
		//merge two array
		ArrayList<Integer> merge= mergeArray(arr1,arr2);
		
		return sortedarraytoBST(merge,0,merge.size()-1);
	}

	public static void main(String[] args) 
	{
		//Bst1
		Node root1=new Node(3);
		root1.left=new Node(1);
		root1.right=new Node(5);
		//Bst2
		Node root2=new Node(4);
		root2.left=new Node(2);
		root2.right=new Node(6);
		Node meargeroot=meargeBST(root1, root2);
		System.out.println("");
		printInorder(meargeroot);

	}

}
