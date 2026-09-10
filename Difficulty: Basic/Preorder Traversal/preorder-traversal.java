/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        Stack<Node>st=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        st.add(root);
        while(!st.isEmpty()){
            root=st.pop();
            list.add(root.data);
            if(root.right!=null){
                st.add(root.right);
            }
            if(root.left!=null){
                st.add(root.left);
            }
        }
        return list;
    }
}