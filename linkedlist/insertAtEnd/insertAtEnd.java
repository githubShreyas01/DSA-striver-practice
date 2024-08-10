// } Driver Code Ends
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        if(head == null || head.next == null){
             Node newNo = new Node(x);
             return newNo;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        Node newN = new Node(x);
        temp.next = newN;
        newN.next = null;
        return head;
    }
}
