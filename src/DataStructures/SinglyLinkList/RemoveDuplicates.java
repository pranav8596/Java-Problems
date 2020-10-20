package DataStructures.SinglyLinkList;






public class RemoveDuplicates 
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
	public void RemoveDups()
	{
		Node current = head;
		while(current!=null && current.next!=null)
		{
			if(current.data==current.next.data)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}
	}
	
	public void show()
	{
		int count=1;
		Node n = head;
		while(n.next!=null)
		{
			System.out.print(n.data+" -> ");
			n = n.next;
			count++;
		}
		System.out.println(n.data);
		System.out.println("No of nodes: "+count);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		RemoveDuplicates s = new RemoveDuplicates();
		s.insert(2);
		s.insert(1);
		s.insert(7);
		s.insert(2);
		s.insert(6);
		s.insert(8);
		s.insert(6);
		s.show();
		s.sort();
		s.show();

		s.RemoveDups();
	
		s.show();
		
		
	}

}
