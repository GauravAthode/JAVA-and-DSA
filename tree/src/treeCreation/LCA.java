package treeCreation;

public class LCA 
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
	
	public static Node findLCA(Node node, int n1 , int n2)
	{
		// base case 
		if(node==null)return null;
		
		// if either n1 or n2 matches the root , return node
		if(node.data==n1||node.data == n2)
		{
			return node;
		}
		
		// search in left and right subtree
		
		Node leftLCA = findLCA(node.left, n1, n2);
		Node rightLCA = findLCA(node.right, n1, n2);
		
		
		// if both side return non - null  return node as LCA
		
		if(leftLCA!=null && rightLCA !=null)
		{
			return node;
		}
		
		// else return non - null
		return (leftLCA!=null)?leftLCA:rightLCA;
		
		
	}
	
	//public static boolean find(Node root, int key)
	
	public static boolean find(Node root , int key )
	{
		if(root == null)return false;
		if(root.data == key)return true;
		return find(root.left, key) || find(root.right, key);
		
	}
	
	
	// check karo node exist before find lca 
	
	public static Node findNode(Node root,int n1, int n2)
	{
		boolean n1Exists =  find(root,n1);
		boolean n2Exists = find(root,n2);
		
		if(!n1Exists || !n2Exists)
		{
			if(!n1Exists && !n2Exists)
			{
				System.out.println("Both nodes "+n1 +" and "+n2+" not present");
			}
			else if (!n1Exists) 
			{
				System.out.println("node "+n1+" is not present");
			}
			else {
				System.out.println("node "+n2+" is not present");
			}
			
			return null;	
		}
				
		return findLCA(root, n1, n2);		
	}

	public static void main(String[] args) 
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		root.right.right = new Node(8);
		
		Node lca = findNode(root,4,7);
		
		if(lca != null)
		{
			System.out.println("LCA OF 2 and 2 is: "+ lca.data);
		}	
	}
}
