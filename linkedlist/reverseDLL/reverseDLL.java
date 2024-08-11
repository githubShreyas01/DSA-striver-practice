// } Driver Code Ends
/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node temp = head;
    Node last = null;
    if(head == null || head.next == null) return head;
    while(temp != null){
        last = temp.prev;
        temp.prev = temp.next;
        temp.next = last;
        temp = temp.prev;
    }
    return last.prev;
}
