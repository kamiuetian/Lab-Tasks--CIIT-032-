package lab3;

import Lab2.Lab2_Linkedlist;
import Lab2.Lab2_Linkedlist.Node;

public class CircularLL {
	 public class Node{  
	        int data;  
	        Node next;  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	  
	    //Declaring head and tail pointer as null.  
	    public Node head = null;  
	    public Node tail = null;  
	  
	    //This function will add the new node at the end of the list.  
	    public void add(int data){  
	        //Create new node  
	        Node newNode = new Node(data);  
	        //Checks if the list is empty.  
	        if(head == null) {  
	             //If list is empty, both head and tail would point to new node.  
	            head = newNode;  
	            tail = newNode;  
	            newNode.next = head;  
	        }  
	        else {  
	            //tail will point to new node.  
	            tail.next = newNode;  
	            //New node will become new tail.  
	            tail = newNode;  
	            //Since, it is circular linked list tail will point to head.  
	            tail.next = head;  
	        }  
	    }  
	  
	    //Displays all the nodes in the list  
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            System.out.println("Nodes of the circular linked list: ");  
	             do{  
	                //Prints each node by incrementing pointer.  
	                System.out.print(" "+ current.data);  
	                current = current.next; 
	            }while(current!= head);  
	            System.out.println();  
	        }  
	    } 
	    //This function will add the new node at the end of the list.  
        public void addAtStart(int data){  
            //Create new node  
            Node newNode = new Node(data);  
            //Checks if the list is empty.  
            if(head == null) {  
                 //If list is empty, both head and tail would point to new node.  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                //Store data into temporary node  
                Node temp = head;  
                //New node will point to temp as next node  
                newNode.next = temp;  
                //New node will be the head node  
                head = newNode;  
                //Since, it is circular linked list tail will point to head.  
                tail.next = head;  
            }  
        }  
        public void deleteEnd() {  
            //Checks whether list is empty  
            if(head == null) {  
                return;  
            }  
            else {  
                //Checks whether contain only one element  
                if(head != tail ) {  
                    Node current = head;  
                    //Loop will iterate till the second last element as current.next is pointing to tail  
                    while(current.next != tail) {  
                        current = current.next;  
                    }  
                    //Second last element will be new tail  
                    tail = current;  
                    //Tail will point to head as it is a circular linked list  
                    tail.next = head;  
                }  
                //If the list contains only one element  
                //Then it will remove it and both head and tail will point to null  
                else {  
                    head = tail = null;  
                }
            }
            }  
	    //Deletes node from the beginning of the list  
	    public void deleteStart() {  
	        //Checks whether list is empty  
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            //Checks whether contain only one element  
	            //If not, head will point to next element in the list and tail will point to new head.  
	            if(head != tail ) {  
	                head = head.next;  
	                tail.next = head;  
	            }  
	            //If the list contains only one element  
	            //then it will remove it and both head and tail will point to null  
	            else {  
	                head = tail = null;  
	            }  
	        } 
	    }
	  
	    public static void main(String[] args) {  
	        CircularLL cl = new CircularLL();  
	        //Adds data to the list  
	        cl.add(1);  
	        cl.add(2);  
	        cl.add(3);  
	        cl.add(4);  
	        //Displays all the nodes present in the list  
	        cl.display();  
	    }  

}
