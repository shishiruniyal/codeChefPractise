import java.util.Scanner;
class Maximum{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int input[] = new int[n];
		for(int i = 0; i < n ; i ++){
			input[i] = sc.nextInt();
		}
		for(int i = 0; i < n ; i++){
			if(input[i] > max1){
				max1 = input[i];
			}
		}
		for(int i = 0; i < n ; i++){
			int val = input[i]%max1;
			if(val > max2){
				max2 = val;
			}
		}
		System.out.println(max2);
		
}
}