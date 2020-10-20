package DataStructures.SinglyLinkList;

import java.util.Random;

public class SortRandomValues 
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
	public void insert(int data)
	{
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void sort()
	{
		System.out.println("Sorted linklist: ");
		Node current = head;
		Node index = null;
		
		while(current!=null)
		{
			index = current.next;
			while(index!=null)
			{
				if(current.data > index.data)
				{
					int temp = current.data;
					current.data = index.data;
					index.data = temp;
					
				}
				index = index.next;
				
			}
			current = current.next;
		
		}
		
	}
	

	public void show()
	{
		Node n = head;
		while(n.next!=null)
		{
			System.out.print(n.data+" -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
	


	public static void main(String[] args) 
	{

		SortRandomValues s = new SortRandomValues();
		
		Random r = new Random();
		for (int i = 0; i < 9; i++) 
		{
			int data = r.nextInt(9)+1;
			s.insert(data);
		}
		s.show();
		
		s.sort();
		s.show();
		

	
		
		
	}

}
