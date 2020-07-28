package bruteforce;

import java.util.Scanner;

public class Problem2231 {
	
	int sum = 0;
	
	public static int f(int n) {
		int sum = n;
		int dividedSum = 0;
		for(int i = 1; i < 9; i++) {
			int a = (int) ((int) n % Math.pow(10, i));
			int b = (int) ((int) n % Math.pow(10, i-1));
			if(b == 0) {
				dividedSum = a;
				sum += dividedSum;
			}
			else if(b != n) {
				dividedSum = (int) ((int) (a - b)/Math.pow(10, i-1));
				sum += dividedSum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = n+1;
		
		
		
		for(int i = 1; i <= n; i++) {
			if(f(i) == n) {
				min = i < min ? i : min;
				System.out.println(i);
			}
		}
		if(min == n+1) {
			System.out.println("0");
		} else
		System.out.println(min);

	}

}
