import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReconstructItiniery {

	
	 public List<String> findItinerary(List<List<String>> tickets) {
         List<String> result = new ArrayList<>();
         Stack<String> stack = new Stack<>();
         Map<String, PriorityQueue<String>> map = new HashMap<>();
         for(List<String> ticket: tickets) {
        	 map.computeIfAbsent(ticket.get(0),k -> new PriorityQueue()).add(ticket.get(1));
         }
         
         stack.push("JFK");
         while(!stack.isEmpty()) {
        	 while(map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()) {
        		 stack.push(map.get(stack.peek()).poll());
        	 }
        	 result.add(0, stack.pop());
         }
         
         
         
         return result;
    }
	
	
	
		public static void main(String[] args) {
			ReconstructItiniery obj = new ReconstructItiniery();
			String[][] input =  {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
			
			List<List<String>> cities = new ArrayList<>();
			for (String[] cityPair : input) {
			    cities.add(Arrays.asList(cityPair));
			}
			
//			System.out.println(cities.toString());
			System.out.println(obj.findItinerary(cities).toString());
			
		}
}
