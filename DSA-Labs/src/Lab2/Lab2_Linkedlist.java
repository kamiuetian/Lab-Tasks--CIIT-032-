package Lab2;

public class Lab2_Linkedlist {
	Node head;
	/*Node class to create the nodes*/
	public static class Node
	{
		int data;
		Node next;
		/*constructor*/
		Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
	}
	
	/*insert new node in linked list*/
    public static Lab2_Linkedlist insert(Lab2_Linkedlist list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
        //new_node.next=head
        //list.head=new_node;
        
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    }
    /*Printing list*/ 
    public static void printList(Lab2_Linkedlist list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
        
    }
    /*Delete Method*/
 // Method to delete a node in the LinkedList by KEY 
    public static Lab2_Linkedlist deleteByKey(Lab2_Linkedlist list, int key) 
    { 
        // Store head node 
        Node currNode = list.head, prev = null; 
  
        // 
        // CASE 1: 
        // If head node itself holds the key to be deleted 
  
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; // Changed head 
  
            // Display the message 
            System.out.println(key + " found and deleted"); 
  
            // Return the updated List 
            return list; 
        } 
  
        // 
        // CASE 2: 
        // If the key is somewhere other than at head 
        // 
  
        // Search for the key to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        while (currNode != null && currNode.data != key) { 
            // If currNode does not hold key 
            // continue to next node 
            prev = currNode; 
            currNode = currNode.next; 
        } 
  
        // If the key was present, it should be at currNode 
        // Therefore the currNode shall not be null 
        if (currNode != null) { 
            // Since the key is at currNode 
            // Unlink currNode from linked list 
            prev.next = currNode.next; 
  
            // Display the message 
            System.out.println(key + " found and deleted"); 
        } 
  
        // 
        // CASE 3: The key is not present 
        // 
  
        // If key was not present in linked list 
        // currNode should be null 
        if (currNode == null) { 
            // Display the message 
            System.out.println(key + " not found"); 
        } 
  
        // return the List 
        return list; 
    }
	
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Lab2_Linkedlist list = new Lab2_Linkedlist(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}


