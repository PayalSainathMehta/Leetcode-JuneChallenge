import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheapestFlightsWithKStops {
	
	static int ans_dfs;
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K)
    {
        ans_dfs=Integer.MAX_VALUE;
        Map<Integer,List<int[]>> map=new HashMap<>();
        for(int[] i:flights)
        {
            map.putIfAbsent(i[0],new ArrayList<>());
            map.get(i[0]).add(new int[]{i[1],i[2]});
        }
        dfs(map,src,dst,K+1,0);
        return ans_dfs==Integer.MAX_VALUE?-1:ans_dfs;
    }
    public static void dfs(Map<Integer,List<int[]>> map, int src, int dst, int k, int cost)
    {
        if(k<0)
            return;
        if(src==dst)
        {
            ans_dfs=cost;
            return;
        }
        if(!map.containsKey(src))
            return;
        for(int[] i:map.get(src))
        {
            if(cost+i[1]>ans_dfs)               //Pruning, check the sum of current price and next cost. If it's greater then the ans so far, continue
                continue;
            dfs(map,i[0],dst,k-1,cost+i[1]);
        }
    }
    


		public static void main(String[] args) {
			int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
			int n = 3;
			int src = 0;
			int dest =  2;
			int k = 0;
			System.out.println(findCheapestPrice(n, flights, src, dest, k));
		}
}
