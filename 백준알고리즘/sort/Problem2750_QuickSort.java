package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2750_QuickSort {
	
	private int[] arr = new int[10];
	
	public static void quickSort(int left, int right, int[] arr) {
		
		int pivot = left; // �Ǻ��� ù ���ڷ� ����
		int j = pivot; // 
		int i = left+1;
		int temp; // ������ ���� ����
		
		if(left<right) {
				// i�� right���� �ݺ�
			for(; i<= right; i++) { 
					// swap ����
				if(arr[i] < arr[pivot]) { // Ű������ ū ���� ���� �� ���� ���������� �̵�
					j++;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
			temp = arr[left];
			arr[left] = arr[j];
			arr[j] = temp;
			
			pivot = j; // ����
			
			// ���İ���
			quickSort(left,pivot-1,arr);
			quickSort(pivot+1,right,arr);
		}
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
