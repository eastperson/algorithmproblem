package bruteforce;

import java.util.Scanner;

public class Problem2798 {

	public static void main(String[] args) {
		
		//카드의 합 < 21, 최대로 만드는 게임
		
		// 카드는 N장
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 딜러가 M을 외친다.
		int m = sc.nextInt();
		int[] arr = new int[num];

		// N장의 카드 중 3장의 카드 선택
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int min = 0;
		int result = 0;
		int result2 = 0;
		Math.abs(min);
		
		// 3장의 카드의 합 <= M, M과 최대한 가깝게
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = i+1; j < arr.length - 1; j++) {
				for(int k = j+1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= m) {
					result = m - sum;
					result2 = m - min;
					min = Math.abs(result) < Math.abs(result2) ? sum : min;
					}
				}
			}
		} // end for
		System.out.println(min);
	}
	
}
