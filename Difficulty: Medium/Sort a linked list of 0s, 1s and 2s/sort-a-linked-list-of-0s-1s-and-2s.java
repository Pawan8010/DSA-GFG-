/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        int c0=0;
        int c1=0;
        int c2=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0) c0++;
             else if(temp.data==1) c1++;
              else c2++;
              
            temp=temp.next;
        }
        temp=head;
         while(temp!=null){
            if(c0>0){
                temp.data=0;
                c0--;
            }
            
             else  if(c1>0){
                temp.data=1;
                c1--;
            }
            
            else{
                temp.data=2;
                c2--;
            }
              
            temp=temp.next;
        }
        return head;
    //     // code here
    //     List<Integer>list=new ArrayList<>();
    //     Node temp1=head;
    //     while(temp1!=null){
    //         list.add(temp1.data);
    //         temp1=temp1.next;
    //     }
        
    //     Collections.sort(list);
    //     // Node dummy=new Node(0);
    //     // Node temp=dummy;
    //   Node temp=head;
    //     int i=0;
       
    //     while(temp!=null){
    //         temp.data=list.get(i);
    //         i++;
    //         temp=temp.next;
    //     }
        
    //     return head;
        
        
        
    }
}