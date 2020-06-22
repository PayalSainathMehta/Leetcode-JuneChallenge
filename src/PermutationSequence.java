import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
	
	public static String getPermutation(int n, int k) {
        		StringBuilder sb = new StringBuilder();
        		List<Integer> numbers = new ArrayList<>();
        		int factorial[] = new int[n+1];
        		
        		for(int i = 1; i <= n; i++) {
        			numbers.add(i);
        		}
        		
        		factorial[0]  = 1;
        		int sum  = 1;
        		for(int i = 1; i <= n; i++) {
        			sum *= i;
        			factorial[i] = sum; 
        		}
        		
        		k--;
        		
        		for(int i = 1; i <=n ; i++) {
        			int index = k / factorial[n-i];
        			sb.append(numbers.get(index));
        			numbers.remove(index);
        			k -= index * factorial[n-i];
        		}
        		
        		
        		return String.valueOf(sb);
    }
	
	
		public static void main(String[] args) {
			int n = 4;
			int k = 14;
			System.out.println(getPermutation(n, k));
		}
}
