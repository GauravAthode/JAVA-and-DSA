package inorderPostorderBT;

import java.lang.classfile.components.ClassPrinter.Node;
import java.security.PublicKey;
import java.util.*;

public class InorderPostorderBt 
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
	
	public static int postindex;
	
	Node buildTree(int inorder[],int postorder[],int Start,int end,Map<Integer, Integer> inMap)
	{
		if(Start>end)
		{
			return null;
		}
		int rootval=postorder[postindex--];
		Node root= new Node(rootval);
		
		int inIndex=inMap.get(rootval);
		root.right=buildTree(inorder, postorder, inIndex+1, end, inMap);
		root.left=buildTree(inorder, postorder, Start, inIndex-1, inMap);
		return root;
		
	}
	
	void printInorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	void printpostorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		printpostorder(root.left);
		
		printpostorder(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) 
	{
		InorderPostorderBt tree=new InorderPostorderBt();
		
		int inorder[]= {4,2,5,1,3};//LNR
		int postorder[]= {4,5,2,3,1};//LRN
		int n=inorder.length;
		Map<Integer, Integer> inMap=new HashMap();
		for(int i=0; i<n;i++)
		{
			inMap.put(inorder[i], i);
		}
		postindex=n-1; //4
		
		Node root=tree.buildTree(inorder,postorder,0,n-1,inMap);
		System.out.println("counstruct tree from inorder ");
		
		tree.printInorder(root);
		System.out.println();
		tree.printpostorder(root);
	}

}
