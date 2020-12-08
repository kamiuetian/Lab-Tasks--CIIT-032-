package lab8;

public class Stack {
/*Declaration*/
	static final int max=50;
	int top;
	int arr[]=new int[max];
	
/*is Empty*/
	boolean isEmpty()
	{
		return (top<0);
	}
	/*Constructor*/
	Stack()
	{
		top=-1;
	}
	/*Push*/
	boolean push(int x)
	{
		/*isFull*/
		if (isFull())
		{
			
			return false;
		}
		else
		{
			arr[++top]=x;
			System.out.println("Item Pushed");
			return true;
		}
	}
	/**isFull*/
	boolean isFull()
	{
		if(top>=(max-1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**POP/*/
	int pop()
	{
		if (isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			int x=arr[top--];
			return x;
		}
	}
	/*Peek*/
	
	int peek()
	{
		if (isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			int x=arr[top];
			return x;
		}
	}	
	
}
class Main{
	public static void main(String args[])
	{
		Stack s=new Stack();
		System.out.print(s.top);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
	}
}










