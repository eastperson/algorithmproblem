package sort;

import java.util.Scanner;

public class Problem2750_BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr.length == 1) {
			
		} else if (arr.length == 2) {
			int temp = arr[0];
			arr[0] = arr[0] < arr[1] ? arr[0] : arr[1];
			arr[1] = temp < arr[1] ? arr[1] : temp;
		} else {
			
			for(int i = 1; i < arr.length; i++) { // È½¼ö
				for(int j = 0; j < arr.length - i; j++) { // ±³Ã¼È½¼ö
					int temp = arr[j+1];
					if(arr[j] > arr[j+1]) {
						arr[j+1] = arr[j];
						arr[j] = temp;
					}
				} // end j for
			} // end i for
			
			
			}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
}
// 1 2 3 4 5
