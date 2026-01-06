package twoSuminBST;

import java.util.*;

public class TwoSuminBST 
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
	
	void inorder(Node root, ArrayList<Integer> list)
	{
		if(root!=null)
		{
			inorder(root.left, list);
			list.add(root.data);
			inorder(root.right, list);
		}
	}
	
	boolean findTarget(Node root,int target)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		inorder(root,list);
		int left=0;
		int rigth=list.size()-1;
		while(left<rigth)
		{
			int sum=list.get(left)+list.get(rigth);
			if(sum==target)
			{
				return true;
			}
			else if(sum<target)
			{
				left++;
			}
			else
			{
				rigth--;
			}	
		}
		return false;
	}

	public static void main(String[] args) 
	{
		TwoSuminBST tree=new TwoSuminBST();
		Node root=null;
		root=tree.insert(root, 5);
		root=tree.insert(root, 3);
		root=tree.insert(root, 7);
		root=tree.insert(root, 2);
		root=tree.insert(root, 4);
		root=tree.insert(root, 8);
		
		int target=9;
		System.out.println("target is= "+target+" the pair of two node ?"+(tree.findTarget(root,target)?"yes":"no"));

	}

}
