package DataStructures;

public class Queue  
{
	static int queue[] = new int[5];
	static int front;
	static int rear;
	static int size;
	public static void enQueue(int data)
	{
		if (!isFull()) {
			System.out.println("Queued: "+data);
			queue[rear] = data;
			rear++;
			size++;
			show();
		} else {
			System.out.println("Cant queue "+data+" Queue is full");
		}
		
		
	}
	public static void deQueue()
	{
		if (!isEmpty()) {
			int data = queue[front];
			front++;
			size--;
			System.out.println("Dequeued: "+data);
			show();
		} else {
			System.out.println("Queue is empty");
		}
	}
	
	public static void peek() {
		if (!isEmpty()) {
			int data = queue[front];
			System.out.println("Peeked: "+data);
		} else {

		}
	}
	public static void show()
	{
		System.out.print("the elememts: ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(queue[front+i]+" ");
		}
		System.out.println();
		System.out.println("Size: "+size);
		System.out.println();
	}		
	
	public static boolean isFull() {
		if (size == queue.length) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) 
	{
		//Queue q = new Queue();
		enQueue(5);
		enQueue(10);
		enQueue(15);
		enQueue(20);
		enQueue(25);
		enQueue(50);
		peek();
		enQueue(55);


		deQueue();
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		deQueue();
	}

}
