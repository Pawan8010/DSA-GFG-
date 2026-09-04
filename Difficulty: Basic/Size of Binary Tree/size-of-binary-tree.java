/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    static int count(Node root,int c){
     if(root==null){
            return 0;
        }
       
       return 1+count(root.left,c++)+count(root.right,c++);
        
        
    
        
    }
    public int getSize(Node root) {
        // code here
        return count(root,0);
        
    }
}