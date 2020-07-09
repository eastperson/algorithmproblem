package 백준알고리즘;

import java.util.Scanner;

class Calculator {
	
	static int smallMultiple(int a, int b) {
		
		
		for(int i = 0; i < 1000; i++) {
			if(a % i == 0) {
				a = a / i;
			}
		}
		
		
		return 1;
	}
}

public class Problem1934 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		

		
		for(int i = 0; i < T; i ++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
		}
	}

}
