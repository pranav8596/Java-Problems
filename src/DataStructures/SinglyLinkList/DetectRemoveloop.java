package DataStructures.SinglyLinkList;


class Node
{
	int data;
	Node next;
}

public class DetectRemoveloop 
{
	static Node head;
	public void insert(int data)
	{
		Node node = new Node();
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
	
	void DetectAndRemoveLoop(Node head)
	{
		Node slow = head;
		Node fast = head;
		
//		slow = slow.next;
//		fast = fast.next.next;
		
        while (fast != null && fast.next != null) 
        { 
        	slow = slow.next;
    		fast = fast.next.next;
    		if(slow==fast)
    		{
    			System.out.println("Loop exits");
    			break;
    		}
        
        }
	

       
        	 if(slow==fast)
            {
            	slow = head;
            	while(slow.next!=fast.next)
             	{
             		slow = slow.next;
             		fast = fast.next;
             	}
             	fast.next = null;
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
		DetectRemoveloop list = new DetectRemoveloop();
		list.insert(5);

		list.insert(10);

		list.insert(15);
		list.insert(20);
		list.insert(25);
		list.insert(30);
		list.show();

		head.next.next = head;
		list.DetectAndRemoveLoop(head);
		list.show();



		
		}
}
