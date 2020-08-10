package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2750_QuickSort {
	
	private int[] arr = new int[10];
	
	public static void quickSort(int left, int right, int[] arr) {
		
		int pivot = left; // 피봇은 첫 숫자로 시작
		int j = pivot; // 
		int i = left+1;
		int temp; // 스왑을 위한 변수
		
		if(left<right) {
				// i를 right까지 반복
			for(; i<= right; i++) { 
					// swap 과정
				if(arr[i] < arr[pivot]) { // 키값보다 큰 값을 만날 때 까지 오른쪽으로 이동
					j++;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
			temp = arr[left];
			arr[left] = arr[j];
			arr[j] = temp;
			
			pivot = j; // 분할
			
			// 정렬과정
			quickSort(left,pivot-1,arr);
			quickSort(pivot+1,right,arr);
		}
	}
	
	public static void quickSort2(int start, int end, int[] arr) {
		start = arr[0];
		end = arr[arr.length-1];
		int i = start + 1;
		int j = end;
		int pivot = start;
		int tmp;
		while(i <= j) {
			while(arr[i] <= arr[pivot]) {
				while(arr[i] <= arr[pivot]) {
					i++;
				}
				while(arr[j] >= arr[pivot] && j > start) {
					j--;
				}
			}
			if(i > j) {
				tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
		}
		
		quickSort2(start, j-1, arr);
		quickSort2(j+1, end, arr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(0, arr.length - 1, arr);
		for(int i : arr) {
			System.out.println(i);
		}


	}

}
