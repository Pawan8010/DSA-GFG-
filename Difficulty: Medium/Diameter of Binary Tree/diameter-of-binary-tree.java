/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int max=0;
    static int solve(Node root){
        if(root==null) return 0;
        
        return 1+Math.max(solve(root.left),solve(root.right));
    }
    public int diameter(Node root) {
        // code here
        
        // base condition
        if(root==null) return 0;
        
        int left=solve(root.left);
        int right=solve(root.right);
        
         max=Math.max(max,left+right);
         diameter(root.left);
         diameter(root.right);
         return max;
         
        
        // return 1+left+right;
        
    }
}