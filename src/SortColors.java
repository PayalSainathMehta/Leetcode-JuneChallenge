import java.util.Arrays;

public class SortColors {
	 public static void sortColors(int[] nums) {
	        	int curr = 0, p0 = 0, p2 = nums.length - 1;
	        	while(curr <= p2) {
	        		if(nums[curr] == 0) {
	        			int temp  = nums[p0];
	        			nums[p0++] = nums[curr];
	        			nums[curr++] = temp;
	        		}
	        		else if(nums[curr] == 2) {
	        			int temp  = nums[curr];
	        			nums[curr++] = nums[p2];
	        			nums[p2--] = temp;
	        		}
	        		else curr++;
	        	}
	    }
	 
	 
	 public static void main(String[] args) {
		int [] nums = {2,0,1,1,2,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
