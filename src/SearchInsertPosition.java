
public class SearchInsertPosition {
		public static int searchInsert(int[] nums, int target) {
				//Binary Search
			 int mid, left = 0, right = nums.length - 1;
			 while(left <= right) {
				 mid = left + (right - left)  / 2;
				 if(nums[mid] == target)  return mid;
				 else if(target < nums[mid]) right = mid -  1;
				 else left = mid + 1;
			 }
			 return left;
    }
		
		
		
		public static void main(String[] args) {
			int[] nums = {1,3};
			int target = 2;
			System.out.println(searchInsert(nums, target));
		}
}
