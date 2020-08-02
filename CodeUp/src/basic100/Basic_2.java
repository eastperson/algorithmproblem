package basic100;

import java.util.Scanner;

public class Basic_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = Double.parseDouble(sc.nextLine());
		int a = (int) num / 1;
		double b = num % 1;
		System.out.println(a);
		System.out.printf("%.6f", b);
	}

}