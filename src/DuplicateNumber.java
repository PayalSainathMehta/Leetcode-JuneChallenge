import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DuplicateNumber {
	
	
	private static List<Integer>returnDuplicateNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		
		int n = nums.length;
		int count[] = new int[n];
		for (int i = 0; i < n; i++)  
        { 
            if (count[nums[i]] == 1) 
                result.add(nums[i]);
            else
                count[nums[i]]++; 
        } 
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,1};
		System.out.println(returnDuplicateNumbers(nums).toString());
	}


}
