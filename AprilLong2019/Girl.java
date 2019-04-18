package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Girl{
	public static void main(String args[]) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(reader);
		int t = Integer.parseInt(bf.readLine());
		while(t > 0){
			int n = Integer.parseInt(bf.readLine());
			String line = bf.readLine();
			String inputPlusChar[] =  line.split(" ");
			String input = inputPlusChar[0];
			char x = inputPlusChar[1].charAt(0);
			long sol = 0;
			int lastpos = -1;
			int l = 0;
			int r = 0;
			for(int i = 0; i < n ; i++){
				char c = input.charAt(i);
				if(c == x){
					l = i-lastpos-1;
					r = n-i-1;
					sol += l*(1+r)+1+r;
					lastpos = i; 
				}
			}
			System.out.println(sol);
			t--;
		}
	}
}