package 백준알고리즘;

import java.util.Scanner;

class Function1065 {
	
	
	
	static void f(int N) {		
		
		int count = 0;
		
		for(int i = 0; i <= N; i++) {
			
			if(0 < i && i < 100) {
				count++;
			
			}
			
			if(100 <= i && i < 1000) {
				int one = i % 10;
				int ten = (i-one) / 10 % 10;
				int hundred = (i-ten-one) / 100 % 10;
				if((hundred - ten) == (ten - one)) {
					count++;
				}
			}
		}
			System.out.println(count);
	}
	
}


public class Problem1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Function1065.f(N);
		

	}

}
