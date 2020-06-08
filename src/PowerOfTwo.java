
public class PowerOfTwo {
	 
	public static boolean isPowerOfTwo(int n) {
		if(n == 0)
			return false;
		
//		int x = (int)(Math.ceil(Math.log(n) / Math.log(2)));
//		int y = (int)(Math.floor(Math.log(n) / Math.log(2)));
//
//		return x==y;
		
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
		
 }
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(isPowerOfTwo(n));
	}

}
