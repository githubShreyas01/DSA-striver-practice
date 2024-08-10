// } Driver Code Ends


/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	if(head == null) return null;
    if(x == 1){
	        head = head.next;
	        return head;
	}
	
	Node temp = head;
	Node prev = null;
	int cnt =0;
	while(temp != null){
	    cnt++;
	    if(cnt == x){
	       prev.next = prev.next.next;
	        break;
	    }
	    prev = temp;
	    temp = temp.next;
	}
	return head;
    }
}
