// } Driver Code Ends


/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		int cnt =0;
		Node temp = head_ref;
		while(temp.next != null){
		    if(cnt == pos) break;
		    temp = temp.next;
		    cnt++;

		}
		
			Node newNode = new Node(data);
		    Node front = temp.next;
		      
		    temp.next = newNode;
		    newNode.prev = temp;
		    if(front != null){
		        newNode.next = front;
		        front.prev = newNode;
		    }else{
		        newNode.next = null;
		    }
	}
}
