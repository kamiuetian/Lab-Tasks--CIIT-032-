package Lab7;

public class dLL {
	Node head;
	class Node
	{
		int data;
		Node next;
		//previous node address
		Node prev;
		Node(int d)
		{
			data=d;
		}
	}
	//Insert a node at the front/start of list
	
	public void insert(int data)
	{
		//1 node create
		Node new_node=new Node(data);
		//next node head address
		new_node.next=head;
		new_node.prev=null;
		//existing head node
		if(head!=null)
		{
			head.prev=new_node;
		}
		//head node updation
		head=new_node;
	}
	//Insert at end 
	public void insertatlast(int data)
	{
		//Node creation
		Node new_node=new Node(data);
		new_node.next=null;
		Node last=head;
		//List is empty
		if(head==null)
		{
			new_node.prev=null;
			head=new_node;
			return;
		}
		//list is non empty
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new_node;
		new_node.prev=last;
	}
	public void insertbetween(Node prev_node, int data)
	{
		//check if prev_node is null
		
		//node creation
		
		//make
	}
	//delete node
	void deleteNode(Node toDel)
	{
		//
		if(head==null || toDel ==null)
		{
			//Print message
			return;
		}
		//single node in dLL / more than one node
		if(head==toDel)
		{
			head=toDel.next;
		}
		if(toDel.next!=null)
		{
			toDel.next.prev=toDel.prev;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
