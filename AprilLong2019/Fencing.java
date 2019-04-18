package CodeChef;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fencing {
	static class pos{
		int x;
		int y;
		public pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			pos other = (pos) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n,m;
			n = sc.nextInt();
			m = sc.nextInt();
			int k = sc.nextInt();
			Set<pos> li = new HashSet<pos>();
			for(int i = 0 ; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				li.add(new pos(x-1, y-1));
			}
			int sol = 4*k;
			int[] X = {0,-1,0,1};
			int[] Y = {-1,0,1,0};
			for(pos p: li) {
				for(int i = 0; i < 4 ; i++) {
					if(isSafe(p.x+X[i],p.y+Y[i],n,m) && li.contains(new pos(p.x+X[i],p.y+Y[i]))){
						sol -=1;
					}
				}
			}
			System.out.println(sol);
			t--;
		}
		
		sc.close();
		
	}
	private static boolean isSafe(int i, int j,int n, int m) {
		if(i < 0 || i >= n || j < 0 || j >= m) {
			return false;
		}
		return true;
	}
}
