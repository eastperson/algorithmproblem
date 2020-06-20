package 백준알고리즘;

import java.util.Scanner;

public class Problem2588 {

	public static int f(int number) {

		int one = number % 10;
		int ten = number % 100 - one;
		int hundred = number % 1000 - ten - one;
		
		number = one + ten + hundred;
		return number;
	}
	
	public static int fone(int number) {

		int one = number % 10;
		int ten = number % 100 - one;
		int hundred = number % 1000 - ten - one;
		
		number = one + ten + hundred;
		return one;
	}
	
	public static int ften(int number) {

		int one = number % 10;
		int ten = number % 100 - one;
		int hundred = number % 1000 - ten - one;
		
		number = one + ten + hundred;
		return ten;
	}
	
	public static int fhundred(int number) {

		int one = number % 10;
		int ten = number % 100 - one;
		int hundred = number % 1000 - ten - one;
		
		number = one + ten + hundred;
		return hundred;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int aone = Problem2588.fone(a);
		int aten = Problem2588.ften(a);
		int ahundred = Problem2588.fhundred(a);
		
		int b = sc.nextInt();
		int bone = Problem2588.fone(b);
		int bten = Problem2588.ften(b);
		int bhundred = Problem2588.fhundred(b);
		
	System.out.println(f(a) * bone);
	System.out.println(f(a) * bten /10);
	System.out.println(f(a) * bhundred /100);
	System.out.println((f(a) * bone) + (f(a) * bten) + (f(a) * bhundred));

	}

}
