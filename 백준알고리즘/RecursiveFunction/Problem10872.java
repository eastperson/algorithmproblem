package RecursiveFunction;

import java.util.Scanner;

public class Problem10872 {
	
	public static int R(int N) {
		if(N == 1) {return N;}
		else if (N == 0) {return 1;}
		return R(N - 1)*N;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(R(N));
		
	}

}
