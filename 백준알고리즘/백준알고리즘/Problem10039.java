package 백준알고리즘;

import java.util.Scanner;


public class Problem10039 {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int number;
		
		
		if(A >= 40) {
			A = A;
		}
		else {
			A = 40;
		}
		
		if(B >= 40) {
			B = B;
		}
		else {
			B = 40;
		}
		
		if(C >= 40) {
			C = C;
		}
		else {
			C = 40;
		}
		
		if(D >= 40) {
			D = D;
		}
		else {
			D = 40;
		}
		
		if(E >= 40) {
			E = E;
		}
		else {
			E = 40;
		}

			System.out.println((A + B + C + D + E) / 5);
			
}
}