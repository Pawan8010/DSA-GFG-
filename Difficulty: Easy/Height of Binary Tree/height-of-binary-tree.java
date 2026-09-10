/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
        // code here
       if (root == null) return -1;

         int rh = height(root.left);
         int lh = height(root.right);

         int maxh = Math.max(rh, lh);

         return 1 + maxh;
       
    }
}