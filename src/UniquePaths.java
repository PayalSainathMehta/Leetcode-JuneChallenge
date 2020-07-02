import java.util.Arrays;

public class UniquePaths {
   public int noOfPaths(int m, int n) {
	   int[][] dp = new int[m][n];
	   
	   for(int[] arr: dp)
		   Arrays.fill(arr, 1);
	   
	   
	   for(int i  = 1; i < m; i++) {
		   for(int j = 1; j < n; j++)
			   dp[i][j] = dp[i-1][j] + dp[i][j-1];
	   }
	   
	   return dp[m - 1][n - 1];
}
   
   
   
   
   public static void main(String[] args) {
	   UniquePaths obj = new UniquePaths();
	  System.out.println( obj.noOfPaths(3, 2));
}
}
