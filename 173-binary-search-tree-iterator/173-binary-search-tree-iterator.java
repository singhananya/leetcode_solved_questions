/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {

     ArrayList<Integer> inorder;
    int i=-1;
    public void rec(TreeNode root, ArrayList<Integer> inorder){
        if(root==null) return;
        rec(root.left,inorder);
        inorder.add(root.val);
        rec(root.right,inorder);
    }
    public BSTIterator(TreeNode root) {
       inorder=new ArrayList<>();
        rec(root,inorder);
    }
    
    public int next() {
        i++;
        return inorder.get(i);
    }
    
    public boolean hasNext() {
        return i+1<inorder.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */