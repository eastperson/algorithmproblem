package 백준알고리즘;

import java.util.Scanner;

public class Problem9325 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int sum = 0;
			int s = sc.nextInt();
			int n = sc.nextInt();
			for(int j = 0; j < n; j++) {
				int q = sc.nextInt();
				int p = sc.nextInt();
				sum += q*p;
			}
			sum += s;
			System.out.println(sum);			
		}

	}

}
