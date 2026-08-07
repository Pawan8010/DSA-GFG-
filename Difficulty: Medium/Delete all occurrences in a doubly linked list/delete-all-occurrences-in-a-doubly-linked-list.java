/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(temp==head) {
                    head=head.next;
                }
            
            Node nextnode=temp.next;
            Node pre=temp.prev;
            
            if(nextnode!=null) nextnode.prev=pre;
            if(pre!=null) pre.next=nextnode;
            
            temp=nextnode;
        }
    
        
        else{
            temp=temp.next;
        }
    }
        return head;
    }
}