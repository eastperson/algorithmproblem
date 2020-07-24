package Math2;

import java.util.Scanner;

public class Problem1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result1 = (w-x) < (h-y) ? (w-x) : (h-y);
		int result2 = x < y ? x : y;
		int result = result1 < result2 ? result1 : result2;
		
		System.out.println(result);
	}

}
