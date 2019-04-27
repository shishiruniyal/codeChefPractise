package CodeChef;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Meal {
	public static void main(String args[])
{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int n;
			n = sc.nextInt();
			Map<Character, Integer> map = new HashMap<Character,Integer>();
			Set<Character> set = new HashSet<Character>();
			set.add('c');
			set.add('o');
			set.add('d');
			set.add('e');
			set.add('h');
			set.add('f');
			for(char c: set) {
				map.put(c, 0);
			}
			for(int i = 0; i < n; i++) {
				String input = sc.next();
				for(char c: input.toCharArray()) {
					if(set.contains(c)) {
						int count = map.get(c)+ 1;
						map.put(c, count);
					}
				}
			}
			int result;
			result = map.get('c')/2;
			result = result < map.get('o')?result:map.get('o');
			result = result < map.get('d')?result:map.get('d');
			result = result < map.get('e')/2?result:map.get('e')/2;
			result = result < map.get('h')?result:map.get('h');
			result = result < map.get('f')?result:map.get('f');
			System.out.println(result);
			t--;
		}
		sc.close();
}
}
