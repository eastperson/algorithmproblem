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

		
		
		while(test < T) {
			test++;
			int k = sc.nextInt();
			int n = sc.nextInt();
			int result = function(n);
			int tmp = 0;
			
			for(int i = 1; i < k; i++) {
				tmp = function(result);
				result = tmp;
			}
			
			System.out.println(result);
			
		}

	}

}
