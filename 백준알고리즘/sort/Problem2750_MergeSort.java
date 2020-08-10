package sort;

import java.util.Scanner;

public class Problem2750_MergeSort {
	
	int n;
	
	int[] sorted;
	
	public void mergeSort(int[] arr, int m, int n) {
		// 크기가 1보다 큰 경우
		if(m < n) {
			int middle = (m + n) / 2;
			mergeSort(arr, m, middle);
			mergeSort(arr, middle + 1, n);
			merge(arr, m, middle, n);
			
		}
		
	}
	
	public void merge(int[] arr, int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
		//작은 순서대로 배열에 삽입
		while(i <= middle && j <= n) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			} else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		//남은 데이터도 삽입
		if(i > middle) {
			for(int t = j; t <= middle; t++) {
				sorted[k] = arr[t];
				k++;
			}
		}
		for(int t = m; t <= n; t++) {
			arr[t] = sorted[t];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] sorted = new int[n];
		Problem2750_MergeSort ms = new Problem2750_MergeSort();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		
		ms.mergeSort(arr, 0, n);
		
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
