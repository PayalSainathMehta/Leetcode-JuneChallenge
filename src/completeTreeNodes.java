
public class completeTreeNodes {
	
	  public int getDepth(TreeNode root) {
		  int d = 0;
		  while(root.left != null) {
			  root = root.left;
			  ++d;
		  }
		  
		  return d;
	  }
	  
	  
	  public boolean exists(int idx, int d, TreeNode node) {
		  //Find if the node exists
		  int left = 0, right = (int)Math.pow(2, d) - 1;
		    int pivot;
		    for(int i = 0; i < d; ++i) {
		      pivot = left + (right - left) / 2;
		      if (idx <= pivot) {
		        node = node.left;
		        right = pivot;
		      }
		      else {
		        node = node.right;
		        left = pivot + 1;
		      }
		    }
		  return node != null;
	  }
	  
		public int countNodes(TreeNode root) {
			  // Easiest - O(N) where n is the number of nodes; - linear search
//				return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
			
			
			//Binary search
			
			if(root == null) return 0;
			int d = getDepth(root);
			if(d == 0) return 1;
			int left =  1, right = (int)Math.pow(2,d)  - 1;
			int pivot;
			while(left <= right) {
				pivot = left + (right - left) / 2;
				if(exists(pivot, d, root)) left = pivot + 1;
				else right = pivot  - 1;
			}
			
	        return (int)Math.pow(2, d) - 1 + left;

    }
}
