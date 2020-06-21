package 백준알고리즘;

import java.util.Scanner;

public class Problem8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		
		for(int i = 1; i <= n; i++) {
			a = a + i;
		}
		System.out.println(a);

	}

}
