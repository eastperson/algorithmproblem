package sort;

import java.util.Scanner;

public class Problem2108 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		float sum = 0;
		int mid = (int) Math.ceil(n/2);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
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
		int count = 0;
		int max = 0;
		int maxIdx = 0;
		int[] arr2 = new int[2];
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			} else if(arr[i] != arr[i+1]) {
				if(max <= count) {					
					max = count;
					maxIdx = arr[i];
					count = 0;
				}
			}
		}
		
		System.out.println((int) Math.round(sum/n));
		System.out.println(arr[mid]);
		System.out.println(maxIdx);
		System.out.println(arr[arr.length - 1] - arr[0]);
		
		
	}

}
