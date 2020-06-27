
public class SumOfRootToLeaf {
    int rootToLeaf = 0;

    public int sumNumbers(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }
    
    
    // recursive - O(n) time and O(H) - recursive stack space
    //iterative using deque stack - same as above.
    //Morris method - same time complexity ,  constant space.
    
    public void preorder(TreeNode root, int currSum){
        if(root != null)
        {
            currSum = currSum * 10 + root.val;
            if(root.left == null && root.right == null)
             rootToLeaf += currSum;
            
             preorder(root.left, currSum);
             preorder(root.right, currSum);

        }
           
       
    }
    
}
