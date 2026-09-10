/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        Stack<Node>st=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        
        
        while(!st.isEmpty() || root!=null){
            while(root!=null){
                st.push(root);
                root=root.left;
                
            }
           
                root=st.pop();
                list.add(root.data);
                
                root=root.right;
                
            
        }
        return list;
    }
}