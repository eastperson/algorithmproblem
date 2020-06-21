package 백준알고리즘;

import java.util.Scanner;

public class Problem10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		while(A > 0 && B < 10) {
			System.out.println(A + B);
			A = sc.nextInt();
			B = sc.nextInt();
			continue;
		}

	}

}