package DataStructures.SinglyLinkList;

public class StackLinkList 
{
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	void push(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head = node;
		}
		
		else
		{
			node.next = head;
			head = node;
		}
			
	}
	
	int pop()
	{
		Node n = head;

		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			head = head.next;

		}
		System.out.println("After popping: ");

		return n.data;

	}
	
	void peek()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int peek = head.data;
			System.out.println("Peek element: "+peek);
		}
	}
	
	int size()
	{
		Node n = head;
		int count = 0;
		while(n!=null)
		{
			count++;

			n=n.next;
		}
		return count;
	}
	void display()
	{
		Node n = head;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			while(n.next!=null)
			{
				System.out.print(n.data+" -> ");
				n = n.next;
			}
			System.out.print(n.data);
		}
	}
	
	public static void main(String[] args) 
	{

		StackLinkList s = new StackLinkList();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.display();
		
		System.out.println();
		System.out.println("Size: "+s.size());

		System.out.println();
		s.pop();
		s.display();
		
		System.out.println();
		s.peek();
		
		
	}

}
