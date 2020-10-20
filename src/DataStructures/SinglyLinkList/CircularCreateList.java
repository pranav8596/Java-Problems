package DataStructures.SinglyLinkList;


public class CircularCreateList 
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
	Node head = null;
	Node tail = null;
	
	
	void insert(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head = node;
			tail = node;
			node.next = head;
		}
		else
		{
			tail.next = node;
			tail = node;
			tail.next = head;
			
		}
		
				
	}
	void Search(int data)
	{
		Node n = head;
		int i=1;
		boolean flag = false;
		while(n.next!=null)
		{
			if(n.data==data)
			{
				flag = true;
				break;
			}
			i++;
			n = n.next;
		}
		if(flag)
		{
			System.out.println("the element "+data+" is present at position "+i);
		}
		else
		{
			System.out.println("element not present");
		}
	}
    public void show() 
    {  
        Node current = head;  
        System.out.println("Nodes of the circular linked list: ");  
         do{  
            System.out.print(current.data+" ");  
            current = current.next;  
            }
         while(current != head);  
            System.out.println();  
         
    }  


	public static void main(String[] args)
	{
		CircularCreateList c = new CircularCreateList();
		c.insert(5);
		c.insert(10);
		c.insert(15);
		c.insert(20);
		c.insert(25);
		c.insert(50);
		c.insert(70);
		c.insert(90);


		c.show();
		c.Search(25);

	}

}
