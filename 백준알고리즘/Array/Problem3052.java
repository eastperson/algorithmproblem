package Array;

import java.util.Scanner;

public class Problem3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				count++;
			}
		}

		
		System.out.println(count);

	}

}
