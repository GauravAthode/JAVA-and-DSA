package inorderPreorderBT;

import java.util.*;

public class InorderPreorderBT 
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
	
	Node buildTree(int inorder[],int preorder[],int Start,int end,Map<Integer, Integer> inMap)
	{
		if(Start>end)
		{
			return null;
		}
		int rootval=preorder[postindex--];
		Node root= new Node(rootval);
		
		int inIndex=inMap.get(rootval);
		root.right=buildTree(inorder, preorder, inIndex+1, end, inMap);
		root.left=buildTree(inorder, preorder, Start, inIndex-1, inMap);
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
	void printpreorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		System.out.print(root.data+" ");
		printpreorder(root.left);
		printpreorder(root.right);
		
	}

	public static void main(String[] args) 
	{
		InorderPreorderBT  tree=new InorderPreorderBT();
		
		int inorder[]= {4,2,5,1,3};//LNR
		int preorder[]= {4,5,2,3,1};//LRN
		int n=inorder.length;
		Map<Integer, Integer> inMap=new HashMap();
		for(int i=0; i<n;i++)
		{
			inMap.put(inorder[i], i);
		}
		postindex=n-1; //4
		
		Node root=tree.buildTree(inorder,preorder,0,n-1,inMap);
		System.out.println("counstruct tree from inorder ");
		System.out.print("Inorder : ");
		tree.printInorder(root);
		System.out.println();
		System.out.print("Preorder : ");
		tree.printpreorder(root);
	}

}
