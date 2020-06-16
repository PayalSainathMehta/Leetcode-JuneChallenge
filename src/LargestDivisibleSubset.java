import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	    public static List<Integer> largestDivisibleSubset(int[] nums) {
	    	int n = nums.length;
	        List<Integer> result = new ArrayList<Integer>();
	        
//	        EDS(Xi) => all divisible subsets that end with Xi.
	        List<List<Integer>> EDS = new ArrayList<>();
	        for(int num: nums) 
	        	EDS.add(new ArrayList<>());
	        
	        Arrays.sort(nums);
	        
	        
	        for (int i = 0; i < n; ++i) {
	            List<Integer> maxSubset = new ArrayList<>();
	                  
	            // Find the largest divisible subset of previous elements.
	            for (int k = 0; k < i; ++k) 
	              if (nums[i] % nums[k] == 0 && maxSubset.size() < EDS.get(k).size())
	                maxSubset = EDS.get(k);
	                
	            // Extend the found subset with the element itself.
	            EDS.get(i).addAll(maxSubset);
	            EDS.get(i).add(nums[i]);
	          }
	          /* Find the largest of EDS values  */
	          for (int i = 0; i < n; ++i) 
	            if (result.size() < EDS.get(i).size()) 
	            	result = EDS.get(i);
	        
	       
	          return result;
	    
	}
	    
	    
	    
	    
	    public static void main(String[] args) {
			int[] nums = {1,2,4,3,9};
			System.out.println(largestDivisibleSubset(nums).toString());
		}
}
