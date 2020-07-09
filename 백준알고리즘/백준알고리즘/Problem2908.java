package 백준알고리즘;

import java.util.Scanner;

class Function2908{
	
	static int f(String number) {
		char a, b, c;
		a = number.charAt(0);
		b = number.charAt(1);
		c = number.charAt(2);
		
		
		
		String newNumber = String.valueOf(c) + String.valueOf(b) + String.valueOf(a); 
		return Integer.parseInt(newNumber);
	}
}


public class Problem2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();

		
		int newA = Function2908.f(A);
		int newB = Function2908.f(B);
		int max;
		
		max = (newA > newB) ? newA : newB;
		System.out.println(max);
	}

}
