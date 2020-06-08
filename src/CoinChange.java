import java.util.ArrayList;
import java.util.List;

public class CoinChange {
//	public static int change(int amount, int[] coins) {
//        List<List<Integer>> list = new ArrayList<>();
//        backtrack(list, new ArrayList<>(), coins, amount, 0);
//        return list.size();
//    }
//	
//	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
//	    if(remain < 0) return;
//	    else if(remain == 0) list.add(new ArrayList<>(tempList));   
//	    else{ 
//	        //System.out.println("List"+list);
//	        for(int i = start; i < nums.length; i++){
//	            tempList.add(nums[i]);
//	            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
//	            // System.out.println("TempList"+tempList);
//	            // System.out.println("List"+list);
//	            tempList.remove(tempList.size() - 1);
//	        }
//	  }
//  }
	
	public static int change(int amount, int[] coins) {
		  int dp[][] = new int[coins.length+1][amount + 1];
	        for(int i=0; i <= coins.length; i++){
	            dp[i][0] = 1;
	        }
	        for(int i=1; i <= coins.length; i++){
	            for(int j=1; j <= amount ; j++){
	                if(coins[i-1] > j){
	                    dp[i][j] = dp[i-1][j];
	                }
	                else{
	                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
	                }
	            }
	        }
	        return dp[coins.length][amount];
    }
	
	public static void main(String[] args) {
		int amount = 5;
		int[] coins = {2};
		System.out.println(change(5, coins));
	}
}

