package Math2;

import java.util.Scanner;

public class Problem3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		int x4 = (x1 == x2) ? x3 : x1 == x3 ? x2 : x1;
		int y4 = (y1 == y2) ? y3 : y1 == y3 ? y2 : y1;
		
		System.out.println(x4 + " " + y4);

	}

}
