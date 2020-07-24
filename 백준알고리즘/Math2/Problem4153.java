package Math2;

import java.util.Scanner;

public class Problem4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String result;
			
			int max = a > b ? a > c ? a : b > c ? b : c : b > c ? b : c;
			int min = a < b ? a < c ? a : b < c ? b : c : b < c ? b : c;
			int mid = a == max ? b == min ? c : b : a == min ? b == max ? c : b : a;
			
			if(min == 0 && mid == 0 && max == 0) {
				break;
			} else if(min == 0 || mid == 0 || max == 0) {
				result = "wrong";
			} if(a != b) {
				result = min*min + mid*mid == max*max ? "right" : "wrong";	
			} else {
				result = "wrong";
			}
			System.out.println(result);
		}
	}

}
