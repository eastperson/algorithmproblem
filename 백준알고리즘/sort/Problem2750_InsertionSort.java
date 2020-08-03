package sort;

import java.util.Scanner;

public class Problem2750_InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//»ðÀÔ Á¤·Ä
		int tmp;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				} else if (arr[j] > arr[j-1]) {
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
