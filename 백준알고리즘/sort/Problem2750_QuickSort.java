package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2750_QuickSort {
	
	
	public void quickSort(int n, int[] arr) {

		int pivot = (int) n/2;
		for(int i = 0; i <= pivot; i++) {
			if(arr[i] >= arr[pivot]) {
				for(int j = arr.length-1; j > pivot; j--) {
					if(arr[j] < arr[pivot]) {
						int tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Problem2750_QuickSort p = new Problem2750_QuickSort();
		
		p.quickSort(n, arr);
		


	}

}
