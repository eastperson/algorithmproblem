package 백준알고리즘;

import java.util.Scanner;

public class Problem5543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int minA;
		int minB;
		int minC;
		int min = 0;
		
		if(A + a < A + b) {
			minA = A + a;		
		}
		else {
			minA = A + b;
		}
		
		if(B + a < B + b) {
			minB = B + a;		
		}
		else {
			minB = B + b;
		}
		
		if(C + a < C + b) {
			minC = C + a;		
		}
		else {
			minC = C + b;
		}
		
		if(minA != minB && minB != minC && minA != minC) {
		
		if(minA < minB) {
			if(minA < minC) {
				min = minA;
			}
			else if (minC < minA) {
				min = minC;
			}
		}
		else if (minB < minC) {
			if(minB < minA) {
				min = minB;
			}
			else if (minA < minB) {
				min = minA;
			}
		}
		else {		if(minA <= minB) {
			if(minA <= minC) {
				min = minA;
			}
			else if (minC <= minA) {
				min = minC;
			}
		}
		else if (minB <= minC) {
			if(minB <= minA) {
				min = minB;
			}
			else if (minA <= minB) {
				min = minA;
			}
		}
			
		}

		}
		System.out.println(min - 50);

	}

	}
}

