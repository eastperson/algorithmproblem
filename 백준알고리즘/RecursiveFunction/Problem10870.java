package RecursiveFunction;

import java.util.Scanner;

public class Problem10870 {
	
	public static int P(int N) {
		if(N == 0) {return 0;}
		else if (N == 1) {return 1;}
		else if (N == 2) {return 1;}
		int result = P(N-1) + P(N-2);
		return result;	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(P(N));

	}

}
