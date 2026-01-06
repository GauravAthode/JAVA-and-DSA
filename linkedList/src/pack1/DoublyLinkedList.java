package pack1;

import pack1.SinglyLinkedList.Node;

public class DoublyLinkedList 
{
	static class Node
	{
		int data ;
		Node next = null;
		Node prv=null;
		
		public Node(int data) 
		{
			this.data = data;
		}
	}
	
	Node head = null;
	Node tail = null;
	 public void deleteByValue(int value) 
	 {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node current = head;

	        do {
	            if (current.data == value) {
	                if (current == head && current == tail) {
	                    head = tail = null;
	                } else {
	                    current.prev.next = current.next;
	                    current.next.prev = current.prev;
	                    if (current == head) head = current.next;
	                    if (current == tail) tail = current.prev;
	                }
	                return;
	            }
	            current = current.next;
	        } while (current != head);

	        System.out.println("Value not found.");
	    }

	public static void main(String[] args) 
	{

	}

}
