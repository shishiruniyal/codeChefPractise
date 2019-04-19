package CodeChef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubTree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<Integer,List<Integer>> map;
		while(t > 0) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			List<Integer> valList = new ArrayList<>(n);
			map = new HashMap<Integer,List<Integer>>();
			boolean[] visited = new boolean[n];
			for(int i = 0 ; i < n ; i++) {
				int val = sc.nextInt();
				valList.add(val);
				map.put(i, new ArrayList<Integer>());
				
			}
			for(int i = 1 ; i < n; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				map.get(u-1).add(v-1);
				map.get(v-1).add(u-1);
			}
			SubTree tree = new SubTree();
			long result = tree.traverseTree(0,map,valList,x,visited);
			System.out.println(result);
			t--;
		}
		
		sc.close();
	}
	private long traverseTree(int currentNode,Map<Integer,List<Integer>> map,List<Integer> valList,long x,boolean[] visited) {
		visited[currentNode] = true;
		List<Integer> li = map.get(currentNode);
		long sum = 0;
		for(int i : li) {
			if(!visited[i])
				sum += traverseTree(i,map,valList,x,visited);
		}
		return Math.max(sum+valList.get(currentNode), -1*x);
	}

}
