// } Driver Code Ends


// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        
        Node newHead = reverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        
        return newHead;
    }
}
