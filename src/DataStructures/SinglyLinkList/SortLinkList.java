package DataStructures.SinglyLinkList;


public class SortLinkList 
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
	void FindMiddleElement()
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null&&fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("middle element: "+slow.data);
		
		

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
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		SortLinkList s = new SortLinkList();
		s.insert(2);
		s.insert(1);
		s.insert(7);
		s.insert(3);
		s.insert(6);
		s.insert(8);
		s.insert(4);
		s.show();
		

		s.sort();
		s.show();
	
		s.FindMiddleElement();
		
		
	}

}
