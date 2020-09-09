package dynamicProgramming;

import java.util.Scanner;

public class Problem10844 {
	public static int stairs(int num) {
		if(num == 1) {
			
			return num*9 - getCount(num-1);
		}
		
		
		return stairs(num-1)*2 - getCount(num-1);
	}
	
	public static int getCount(int num) {
		int count = 0;
		if(num == 0) {
			return 0;
		}
		for(int i = 0; i < num; i++) {
			String str = String.valueOf(num);
			int a = str.toCharArray()[str.length()-1] -'0';
			if(a == 0 || a== 9)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(stairs(n));
	}
}
