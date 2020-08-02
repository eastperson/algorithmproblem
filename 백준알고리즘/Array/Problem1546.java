package Array;

import java.util.Scanner;

public class Problem1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		float[] arr = new float[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr.length - 1; j++) {
				if(arr[j] >= arr[j+1]) {
					float tmp = 0;
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		}
		
		float max = arr[arr.length - 1];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
		}
		
		float sum = 0;
		
		for(int i = 0; i < arr.length; i++) {	
			sum += arr[i];
		}
		
		float result = sum/arr.length;
		System.out.println(result);

	}
}
