package DataStructures.SinglyLinkList;


class Reverse { 


	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	static Node head;
	public void insert(int data)
	{
		Node Node = new Node(data);
		Node.data = data;
		Node.next = null;
		
		if(head==null)
		{
			head = Node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = Node;
		}
	}
	
	Node reverse(Node node) 
	{ 
		Node prev = null; 
		Node current = node; 
		Node next = null; 
		while (current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
		} 
		return prev; 
	} 

	// prints content of double linked list 
//	void printList(Node node) 
//	{ 
//		while (node != null) { 
//			System.out.print(node.data + " -> "); 
//			node = node.next; 
//		} 
//	} 
	public void show()
	{
		Node n = head;
		while(n.next!=null)
		{
			System.out.print(n.data+" -> ");
			n = n.next;
		}
		System.out.print(n.data);
	}
	public static void main(String[] args) 
	{ 
		Reverse list = new Reverse(); 
//		list.head = new Node(85); 
//		list.head.next = new Node(15); 
//		list.head.next.next = new Node(4); 
//		list.head.next.next.next = new Node(20); 
//		list.head.next.next.next.next = new Node(25); 
//
//
//		System.out.println("Given Linked list"); 
//		list.printList(head); 
//		head = list.reverse(head); 
//		System.out.println(""); 
//		System.out.println("Reversed linked list "); 
//		list.printList(head); 
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.show();
		System.out.println();
		head = list.reverse(head);
		list.show();
	} 
} 

