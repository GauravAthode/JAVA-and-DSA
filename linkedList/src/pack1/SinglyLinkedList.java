package pack1;

import java.util.concurrent.ConcurrentHashMap;

public class SinglyLinkedList 
{
	static class Node
	{
		int data ;
		Node next = null;
		
		public Node(int data) 
		{
			this.data = data;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	
	// 1. insert at end
	
	public void insertAtEnd(int data)
	{
		Node newNode  = new Node(data);
		if(head==null)
		{
			head =tail=newNode;
		}
		else 
		{
			tail.next = newNode;
			tail = newNode;
			
		}
				
	}
	
	
	
	// 2. insert at begining
	public void insertAtBegining(int data)
	{
		Node newNode  = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
		}
		else 
		{
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	// insertAtPosition
	
	public void insertAtPosition(int pos , int data)
	{
		Node newNode = new Node(data);
		if(pos<0)
		{
			System.out.println("invalid position: ");
			return;
		}
		if(pos==0)
		{
			insertAtBegining(data);
			return;
		}
		
		Node current = head;
		int count = 0 ; 
		while(current!=null && count<pos-1) 
		{
			
			current = current.next;
			count++;
			
		}
		
		if(current == null)
		{
			System.out.println("position is out of bound");
			return;
		}
		
		
		newNode.next = current.next;
		current.next = newNode;
		
		if(newNode.next == null)
		{
			tail = newNode;
		}
		
	}
	
	// 4. delete by value
	public void deleteByValue(int value)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		
		if(head.data==value)
		{
			head= head.next;
			if(head==null)
			{
				tail = null;
			}
		}
		
		Node current = head;
		while(current.next!=null && current.next.data != value)
		{
			current = current.next;
			
		}
		
		if(current.next == null)
		{
			System.out.println("data not found");
		}
		else 
		{
			current.next = current.next.next;
			if(current.next == null)
			{
				tail = current;
			}
			
		}
		
		
		
		
	}
	
	
	// 5. update value
	
	public void updatValue(int oldVal, int newVal)
	{
		Node current =head;
		boolean found =false;
		while(current!=null)
		{
			if(current.data==oldVal)
			{
				current.data=newVal;
				found=true;
				break;
			}
			current=current.next;
		}
		
		
	}
	
	// 6. search value
	public boolean searchValue(int key)
	{
		Node current =head;
		while(current!=null)
		{
			if(current.data==key)
			{
				System.out.println("found");
				return true;
			}
			current=current.next;
		}
		System.out.println("not found");
		return false;
		
	}
	
	// 7. lengthofLl
	public int length()
	{
		int count=0;
		Node current =head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	
	
	//reverse
	public void reverse() 
	{
		Node current=head;
		Node prv=null;
		tail=head;
		while(current!=null)
		{
			Node nextNode =current.next;
			current.next=prv;
			prv=current;
			current= nextNode;
		}
		head=prv;

	}
	
    //	find mid element
	public void printMiddle() 
	{
		if(head==null)
		{
			System.out.println("list is empty:");
			return;
		}
		Node slowNode=head;
		Node fastNode=head;
		while(fastNode!=null&&fastNode.next!=null)
		{
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
		}
		System.out.println("Middle element: = "+slowNode.data);
		
	}
	
	//sort
	public void sort()
	{
		if(head==null||head.next==null)
		{
			return;
		}
		
		Node i,j;
		for(i=head; i!=null; i=i.next)
		{
			for(j=head;j.next!=null; j=j.next)
			{
				if(j.data>j.next.data)
				{
					int temp=j.data;
					j.data=j.next.data;
					j.next.data=temp;
				}
			}
		}
		
	}
	
	// print
	public void print()
	{
		
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		
		
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data +" ->");
			current = current.next;
		}
		System.out.print("null");
		
	}
	
	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtBegining(10);
		list.insertAtBegining(20);
		list.insertAtBegining(30);
		list.insertAtEnd(40);
		list.insertAtPosition(2,25);
		list.print();
		list.deleteByValue(25);
		System.out.println();
		list.print();
		System.out.println();
		list.updatValue(10, 100);
		list.print();
		System.out.println();
		System.out.println(list.length());
		list.reverse();
		list.print();
		System.out.println();
		list.insertAtBegining(45);
		list.insertAtEnd(34);
		list.print();
		System.out.println();
		list.printMiddle();
		list.sort();
		list.print();
		
		
	}
	
}
