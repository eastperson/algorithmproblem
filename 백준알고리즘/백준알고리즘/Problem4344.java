package 백준알고리즘;

import java.util.Scanner;

public class Problem4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			int count = 0;
			
			for(int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			int avg = sum / arr.length;
			
			for(int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", (float) count / arr.length * 100);
			System.out.print("%");
			System.out.println();
		
		}
		

	}

}
