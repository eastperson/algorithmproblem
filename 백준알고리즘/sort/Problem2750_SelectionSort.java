package sort;

import java.util.Scanner;

public class Problem2750_SelectionSort {
	
	
	public void selectionSort (int n, int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int num = i;
			for(int j = i; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					num = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[num];
			arr[num] = tmp;
		}	
		
	}

	public static void main(String[] args) {
		Problem2750_SelectionSort p = new Problem2750_SelectionSort();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		// 선택정렬
		
		
		p.selectionSort(n, arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
