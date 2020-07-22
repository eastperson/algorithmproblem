package Math2;

import java.util.Scanner;

public class Problem4948 {

	
	public static void f(int N) {
		
		for(int i = 1; i <= N; i++) {
			int a = 6*i - 1;
			System.out.println(a);
	}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int sum = 0;
		
		do {
		int n = sc.nextInt();
		T = n;
		
		f(n);
		
		} while(T != 0);
		
		
	}

}
