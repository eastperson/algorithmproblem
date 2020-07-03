package 백준알고리즘;

import java.util.Scanner;

public class Problem15596 {

	public static void main(String[] args) {
//		
//		
//		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = n;
			sum += a[i];
		}
		
		System.out.println(sum);

	}

}
