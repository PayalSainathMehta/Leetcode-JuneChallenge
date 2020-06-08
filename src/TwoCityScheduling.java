import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
		public static int twoCitySchedCost(int[][] costs) {
			//DOESNT WORK CAUSE WE NEED N PEOPLE DIVIDED EQUALLY
//			int result = 0;
//			for(int i = 0; i  < costs.length; i++) {
//				int min = 0;
//				if(costs[i][0] < costs[i][1])
//					min = costs[i][0];
//				else
//					min = costs[i][1];
//				result = result + min;
//			}
			
			
			Arrays.sort(costs, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o1[1] - (o2[0] - o2[1]);
				}
			});
			int total = 0;
			int n = costs.length / 2;
			for(int i = 0; i < n; i++) {
				total += costs[i][0] + costs[i+n][1];
			}	
			return total;
    }
		
		public static void main(String[] args) {
			int[][] costs  = {{10,20},{30,200},{400,50},{30,20}};
			System.out.println(twoCitySchedCost(costs));
		}
}
