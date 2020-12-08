package lab9;

public class Queue {

	int size=5;
	int items[]=new int[size];
	int front,rear;
	Queue()
	{
		this.front=0;
		this.rear=0;
	}
	/*Enqueue*/
	public void enqueue(int data)
	{
		items[rear]=data;
		rear=(rear+1)%size;
	}
	/*Dequeue*/
	public int dequeue()
	{
		int data=items[front];
		front=front+1;
		return data;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(items[front+i]);
		}
	}
	
	
	
	
	
	
	
	
	
}
