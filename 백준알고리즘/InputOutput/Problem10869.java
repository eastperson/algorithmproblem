package InputOutput;

import java.util.Scanner;

public class Problem10869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
//		System.out.println( (int) (A / B));
//		System.out.println(Math.floor(A / B));
		System.out.println(A / B - (A % B / B));
		System.out.println(A % B);
		
		

	}

}
