package Ex1;

import java.util.Scanner;

public class Problem2523 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= (2 * N -1); i++) {
			if(i <= N) 
			{
				for(int j = 1; j <= i; j++) 
				{
				System.out.print("*");
				}
			}
			else 
			{
				for(int k = (2* N - i); k > 0; k--) 
				{
				System.out.print("*");
				}
				
			}
			System.out.println();
	}
}
}
