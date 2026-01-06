package bstIncertion;


public class BSTInsertion 
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
	
	BSTInsertion()
	{
		root = null;
	}
	
	void insert(int key)
	{
		root = insertrec(root,key);
	}
	
	
	public Node insertrec(Node root, int key )
	{
		if(root == null)
		{
			root = new Node(key) ;
			return root;
		}
		
		if(key<root.data)
		{
			root.left = insertrec(root.left,key);
		}
		
		else if(key>root.data)
		{
			root.right = insertrec(root.right, key);
		}
			
		return root;
		
		
	}
	
	void deltetKey(int key)
	{
		root = deleteRec(root,key);
		
	}
	
	Node deleteRec(Node root, int key)
	{
		
		
		if(root==null)return root;
		
		// traversing the tree
		if(key<root.data)
		{
			root.left = deleteRec(root.left, key);
		}
		
		else if(key>root.data)
		{
			root.right = deleteRec(root.right, key);
		}
		
		else 
		{
			// case 1 and case 2 
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right == null)
			{
				return root.left;
			}
			
			
			// case3 node has two child 
			
			// find inorder sucessor (smallest in the right sub tree )
			root.data = minValue(root.right);
			
			// delete the in order sucessor
			root.right = deleteRec(root.right, root.data);
			
		}
		
		return root;
	}
	
	
	
	int minValue (Node root)
	{
		int min = root.data;
		while(root.left!=null)
		{
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	void inorder()
	{
		inorderRec(root);
	}
	
	void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.print(root.data+" ");
			inorderRec(root.right);
		}
	}
	
	
	boolean search(int key)
	{
		return serachRec(root,key);
	}	
	boolean serachRec(Node root ,  int key)
	{
		
		if(root==null )return false;
		if(root.data == key) return true;
		// go left or right 
		if(key<root.data)
		{
			return serachRec(root.left, key);
		}
		
		else 
		{
			return serachRec(root.right, key);
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		BSTInsertion tree =  new BSTInsertion();
		tree.insert(50);
		tree.insert(30); 
		tree.insert(70);	
		tree.insert(20);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		System.out.print("inorder traversl before deletion  = ");
		tree.inorder();
		
		System.out.println();
		System.out.print("inorder traversl after deletion  = ");
		
		// case 1 
		tree.deltetKey(20);
		tree.inorder();
		// case2 
		System.out.println();
		tree.deltetKey(30);
		tree.inorder();
		// case3 
		System.out.println();
		tree.deltetKey(50);
		tree.inorder();
		System.out.println();
		System.out.println(tree.search(410));
		
		
		
		
	}

}
