package DataStructures.SinglyLinkList;

import DataStructures.SinglyLinkList.SortLinkList.Node;

 class newNode
{
	int data;
	newNode next;
}

public class LinkedList 
{
	newNode head;
	public void insert(int data)
	{
		newNode newNode = new newNode();
		newNode.data = data;
		newNode.next = null;
		
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			newNode n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = newNode;
		}
		System.out.println("after inserting "+data+" we get;");
	}
	public void insertAtStart(int data)
	{
		newNode newNode = new newNode();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
		System.out.println("after inserting "+data+" at start, we get:");
	}
	public void inserAt(int index, int data)
	{
		newNode newNode = new newNode();
		newNode.data = data;
		newNode.next = null;
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
		newNode n = head;
		for(int i = 0; i<index-1; i++)
		{
			n = n.next;
		}
		newNode.next = n.next;
		n.next = newNode;
		}
		System.out.println("after inserting "+data+" at index no "+index+" we get;");
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			newNode n = head;
			newNode n1 = null;
			for(int i = 0; i<index-1; i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
		System.out.println("after deleting "+index+"nd element, we get:");
	}
	void Search(int data)
	{
		newNode n = head;
		int j=0;
		boolean flag = false;
		while(n!=null)
		{
			if(n.data==data)
			{
				flag = true;
				break;
			}
			j++;
			n = n.next;
		}
		if(flag)
		{
			System.out.println("the element "+data+" is present at position "+j);
		}
		else
		{
			System.out.println("element not present");
		}
		int index1 = j;
		newNode n2 = null;
		for( j = 0; j<index1-1; j++)
		{
			n = n.next;
		}
		n2 = n.next;
		n.next = n2.next;
		//System.out.println("dele");
		
	}
	void FindMiddleElement()
	{
		newNode slow = head;
		newNode fast = head;
		while(fast!=null&&fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("middle element: "+slow.data);
		
	}
	

	
	public void show()
	{
		newNode n = head;
		while(n.next!=null)
		{
			System.out.print(n.data+" -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}


	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.insert(5);
		list.show();
		System.out.println();

		list.insert(10);
		list.show();
		System.out.println();

		list.insert(15);
		list.show();
		System.out.println();
		
		//list.FindMiddleElement();
		list.Search(5);
		list.show();

		list.insertAtStart(25);
		list.show();
		System.out.println();

		list.inserAt(1, 55);
		list.show();
		list.insert(30);
		list.show();
		list.FindMiddleElement();

		System.out.println();

		list.deleteAt(2);
		list.show();
		list.insert(90);
		list.show();

		list.insert(95);
		list.show();

		list.insert(91);
		list.show();

//		list.insert(99);
//		list.show();
//		
		list.Search(90);
		//list.show();
		}
}
