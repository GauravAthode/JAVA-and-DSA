package treeCreation;


import java.util.*;


public class Main
{
	// BASIC NODE CREATION
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
	
	// PAIR CLASS TO KEEP (NODE , HD)
	
	static class Pair
	{
		Node node;
		int hd;
		public Pair(Node n , int h) 
		{
			node = n;
			hd = h;
		}
	}
	
	public static void verticalOrder(Node root)
	{
		if(root == null)return;
		
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		// bfs queue
		Queue<Pair> q =  new LinkedList<>();
		q.offer(new Pair(root, 0));
		
		
		while(!q.isEmpty())
		{
			Pair curr = q.poll();
			Node node = curr.node;
			int hd = curr.hd;
			
			// add node to its hd bucket
			
			map.putIfAbsent(hd, new ArrayList<>());
			map.get(hd).add(node.data);
			
			// push children with HD 
			if(node.left!=null) q.offer(new Pair(node.left, hd-1));
			if(node.right!=null) q.offer(new Pair(node.right, hd+1));
			
			
			
		}
		
		// print left to right 
		for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet())
		{
			for(int val : entry.getValue())
			{
				System.out.print(val + " ");
			}
						
		}
		
		
	}


	public static void main(String[] args) 
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		System.out.println("vertical order traversal: ");
		verticalOrder(root);
		
		

	}

}
