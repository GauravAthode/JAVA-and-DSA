package inorderPreorderSuceesor;

import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import bstIncertion.BSTInsertion.Node;

public class InorderPreorderSuceesor 
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
	
	//find inorder predecessor and succ
	void findPresuc(Node root,int key)
	{
		Node pred=null;
		Node succ=null;
		Node curr=root;
		while(curr!=null)
		{
			if(curr.data==key)
			{
				//case 1 left subtree exist------>
				if(root.left!=null)
				{
					Node temp=curr.left;
					while(temp.right!=null)
					{
						temp=temp.right;
					}
					pred=temp;
				}
				//case 2 
				if(curr.right!=null)
				{
					Node temp=curr.right;
					while(temp.left!=null)
					{
						temp=temp.left;
					}
					succ=temp;
				}
				break;
			}
			else if(key<curr.data)
			{
				succ=curr;
				curr=curr.left;
			}
			else 
			{
				pred=curr;
				curr=curr.right;
				
			}
		}
		if(pred!=null)
		{
			System.out.println("predecessor = "+pred.data);
		}
		else {
			System.out.println("succesor = none ");
		}
		if(succ!=null)
		{
			System.out.println("succesor = "+succ.data);
		}
		else {
			System.out.println("predecessor = none ");
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InorderPreorderSuceesor tree=new InorderPreorderSuceesor();
		int values[]= {20,10,30,5,15,40};
		for(int v:values)
		{
			tree.root=tree.insert(tree.root,v);
		}
		System.out.println("case 1: key 20");
		tree.findPresuc(tree.root, 20);

	}

}
