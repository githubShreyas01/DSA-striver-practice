// } Driver Code Ends


/*

Definition for doubly Link List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        Node temp = head;
        int cnt = 0;
        if(x == 1) return head.next;
        
        while(temp.next != null){
            cnt++;
            if(cnt == x) break;
            temp = temp.next;
        }
        
        Node prev = temp.prev;
        prev.next = temp.next;
        temp.prev = null;
        return head;
    }
}
