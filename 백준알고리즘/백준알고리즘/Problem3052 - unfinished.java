package 백준알고리즘;

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
				if(arr[i] == arr[j]) {
					count += 1;
				}
			}
		}
		
		int difCount = arr.length - ((count - 10) / 2);
		
		System.out.println(difCount);

	}

}
