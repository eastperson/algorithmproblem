package Math1;

import java.util.Scanner;

public class Problem2775 {
	
	static int function(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int test = 0;
		int sum = 0;
		
		int[] arr = new int[14];
		
		for(int i = 1; i <= 14; i++) {
			arr[i-1] = i;
		}
		
		
		
		int[] arr2 = new int[14];
		
			for(int i = 1; i <= 14; i++) {
				for(int j = 1; j <= i; j++) {
					sum += arr[j-1];
				}
				arr2[i] = sum;
				sum = 0;
			}
		
		
		while(test < T) {
			test++;
			int k = sc.nextInt();
			int n = sc.nextInt();
			int result = 0;
			int sum = 0;
			
			for(int i = 0; i < k; i++) {
				for(int j = 1; j <= n; j++) {
					sum += function(j);
					result += sum;
					sum = 0;
				}
			}
			
			System.out.println(result); // 아 전혀 모르겠다.
			
		}

	}

}
