package 백준알고리즘;

import java.util.Scanner;

public class Problem2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a > b ? a > c ? a : c : b > c ? b : c;
		int mid = a == max ? b > c ? b : c : b == max ? a > c ? a : c : c == max ? a > b ? a : b : null;
		int min = a < b ? a < c ? a : c : b < c ? b : c;
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);

	}

}
