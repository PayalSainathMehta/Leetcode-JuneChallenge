
public class IsSubsequence {
			public static boolean isSubsequence(String s, String t) {
				
				int m = s.length();
				int n = t.length();
				if(m == 0 || n == 0)
					return false;
				int j = 0;
				for(int i = 0; i < n && j < m; i++) {
					if(t.charAt(i) == s.charAt(j))
						j++;
				}
				
				return (j == m);
				
			}
			
			
			public static void main(String[] args) {
				 System.out.println(isSubsequence("abcd", "ahbgdc"));
			}
}
