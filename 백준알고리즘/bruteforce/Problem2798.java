package bruteforce;

import java.util.Scanner;

public class Problem2798 {

	public static void main(String[] args) {
		
		//ī���� �� < 21, �ִ�� ����� ����
		
		// ī��� N��
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// ������ M�� ��ģ��.
		int m = sc.nextInt();
		int[] arr = new int[num];

		// N���� ī�� �� 3���� ī�� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int min = 0;
		int result = 0;
		int result2 = 0;
		Math.abs(min);
		
		// 3���� ī���� �� <= M, M�� �ִ��� ������
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
