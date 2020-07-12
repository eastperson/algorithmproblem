package Math1;

import java.util.Scanner;

public class Problem2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int five = 0; 
		int three = 0;
		
		if(N % 5 == 0) {
			five = N / 5;
		}
		else if (N % 5 != 3 && N % 3 == 0) {
			
		}
		
		else if((N % 5) == 3) {
			five = N / 5;
			three = (N % 5) / 3;
		}
		else {
			three = -five - 1;
		}
		
		System.out.println(five + three);

	}

}
