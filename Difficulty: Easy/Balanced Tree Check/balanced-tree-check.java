/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    static int find(Node root){
        if(root==null) return 0;
        
        return 1+Math.max(find(root.left),find(root.right));
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root==null) return true;
        
         int left=find(root.left);
         int right=find(root.right);
         
         if(Math.abs(left-right)>1) return false;
         
         boolean lh=isBalanced(root.left);
         boolean rh=isBalanced(root.right);

         return lh&rh;
    }
}