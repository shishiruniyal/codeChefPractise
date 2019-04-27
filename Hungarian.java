package CodeChef;

import java.util.Scanner;

public class Hungarian {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test > 0) {
			int n = sc.nextInt();
			boolean result = true;
			boolean[][] a = new boolean[n][n];
			for(int i = 0; i < n ; i++ ) {
				for(int j = 0 ; j < n ; j++) {
					int temp = sc.nextInt();
					if(temp == 0) {
						a[i][j] = true;
					}
				}
			}
			for(int i = 0; i < n ; i++ ) {
				boolean inner1 = false;
				boolean inner2 = false;
				for(int j = 0 ; j < n ; j++) {
					if(a[i][j]) {
						inner1 = true;
					}
					if(a[j][i]) {
						inner2 = true;
					}
				}
				result = result && inner1 && inner2;
				if(!result)
					break;
			}
			
			if(result) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			test --;
		}
		sc.close();
	}
}
