package DataStructures;
public class Stack 
{
	static int stack[] = new int[5];
	static int top = 0;

	public static void push(int data)
	{
		stack[top] = data;
		top++;
	//	System.out.println("after pushing "+data+", the stack is:");
		System.out.println("Pushed "+data+" into the stack");
		show();
	}
	
	public static void pop()
	{
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		//return data;
		System.out.println("Popped "+data+" out of the stack");
		show();
	}
	public static void peek()
	{
		int data;
		top--;
		data = stack[top];
//		return data;
		System.out.println("Peeked: "+data);
		top++;
	}
	public static void show()
	{
		for (int i = 0; i <5; i++) 
		{
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		//Stack s = new Stack();
		push(10);
		System.out.println();
		
		push(15);
		System.out.println();
		
		peek();

		push(20);
		System.out.println();

		pop();
		System.out.println();
		
		peek();
	}

}
