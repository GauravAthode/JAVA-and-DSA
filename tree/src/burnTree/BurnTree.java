package burnTree;

import java.util.*;

import javax.management.remote.TargetedNotification;

public class BurnTree 
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
	
	public static Node bfsToMapParents(Node root,Map<Node, Node>parentMap,int target)
	{
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		Node targetNode=null;
		
		while(!q.isEmpty())
		{
			Node curr=q.poll();
			if(curr.data==target)
			{
				targetNode=curr;
			}
			
			if(curr.left!=null)
			{
				parentMap.put(curr.left, curr);
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				parentMap.put(curr.right, curr);
				q.add(curr.right);
			}
		}
		
		return targetNode;
	}
	
	public static int burnTree(Node targetNode, Map<Node, Node>parentMap)
	{
		Queue<Node>q=new LinkedList();
		
		Map<Node, Boolean> visited=new HashMap();
		q.add(targetNode);
		visited.put(targetNode, true);
		int time=0;
		while(!q.isEmpty())
		{
			int size=q.size();
			boolean flag=false;
			for(int i=0;i<size;i++)
			{
				Node curr=q.poll();
				
				//left neighbor
				if(curr.left!=null && visited.get(curr.left)==null)
				{
					flag=true;
					visited.put(curr.left, true);
					q.add(curr.left);

				}
				
				//right neighbor
				
				if(curr.right!=null && visited.get(curr.right)==null)
				{
					flag=true;
					visited.put(curr.right, true);
					q.add(curr.right);
				}
				
				//parent neighbor
				if(parentMap.get(curr)!=null && visited.get(parentMap.get(curr))==null)
				{
					flag=true;
					visited.put(parentMap.get(curr), true);
					q.add(curr.right);
					
				}
				
			}
			
			if(flag)
			{
				time++;
			}	
		}
		return time;
	}
	
	public static int  minTime(Node root, int target)
	{
		Map<Node, Node>parentMap=new HashMap();
		Node targetNode= bfsToMapParents(root,parentMap,target);
		return burnTree(targetNode,parentMap);
	}

	public static void main(String[] args) 
	{
		Node root =new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(4);
		root.left.right.right=new Node(8);
		root.left.right.right.left=new Node(9);
		root.left.right.right.right=new Node(10);
		root.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		int target =8;
		System.out.println("Minimum time to burn the tree = " + minTime(root, target));
		
	}
}
