
public class PerfectSquares {
	
	
	
	public boolean isSquare(int n) {
		int sq  = (int)Math.sqrt(n);
		return n == sq * sq;
	}
	
	 public  int numSquares(int n) {
	        
		 	if(isSquare(n)) return 1;
		 	
		 	while(n % 4 == 0)
		 		n = n / 4;
		 	if(n % 8 == 7)
		 		return 4;
		 	
		 	 for (int i = 1; i * i <= n; ++i) {
		 	      if (isSquare(n - i * i))
		 	        return 2;
		 	    }
		 	    // bottom case of three-square theorem.
		 	    return 3;
	    }
	 
	 
		public static void main(String[] args) {
			int n = 13;
			PerfectSquares obj = new PerfectSquares();
			System.out.println(obj.numSquares(n));
			
			
		}
}
