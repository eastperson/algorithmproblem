package 백준알고리즘;

import java.util.Scanner;

public class Problem2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}

	}

}
