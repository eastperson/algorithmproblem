package Math1;

import java.util.Scanner;

public class Problem2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long V = sc.nextLong();		
		double days = 0.0;
		
		days = Math.ceil((double) (V-B) / (double)  (A-B));

		System.out.println((long) days);
	}

}

/*
 * package Math1;

import java.util.Scanner;

public class Problem2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = (long) (Math.random()*100) + 1;
		long B = 0;
		long V = 0;		
		
		
		while(true) {
			long b = (long) (Math.random()*100) + 1;
			if(b < A) {
				B = b;
				break;
			}
		}
		
		while(true) {
			long v = (long) (Math.random()*100) + 1;
			if(A <= v) {
				V = v;
				break;
			}
		}
		
		double days = 0.0;
		
		
		days = Math.ceil((double) (V-B) / (double)  (A-B));
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(V);

		System.out.println((long) days);

	}

}
 */


