package lab8;

public class StackLinkedList {
	Node head;
	
static class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
/*push item in stack*/
public void push(int data)
{
	Node new_node=new Node(data);
	if(head==null)
	{
		head=new_node;
	}
	else
	{
		new_node.next=head;
		head=new_node;
	}
	
}
/*pop */
public int pop()
{
	int x;
	if(isEmpty())
	{
	//stack is empty	
	}
	else
	{
		x=head.data;
		head=head.next;
	}
	return x;
	}
}
/*peek */
public int peek()
{
	int x;
	if(isEmpty())
	{
	//stack is empty	
	}
	else
	{
		x=head.data;
	}
	return x;
	}

}
/*is Empty
*/
public boolean isEmpty()
{
	if(head==null)
	{
		return true;
	}
	else {
		return false;
	}
	}










