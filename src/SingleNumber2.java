
public class SingleNumber2 {
	
	
	static int getSingleNumber(int[] nums) {
		int seenOnce = 0, seenTwice = 0;
		
		
		for(int num: nums) {
			seenOnce = ~seenTwice & (seenOnce ^ num);
			seenTwice= ~seenOnce & (seenTwice ^ num);

		}
		
		return seenOnce;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,2,1,1,3,3,3,4};
		System.out.println(getSingleNumber(nums));
	}
}
