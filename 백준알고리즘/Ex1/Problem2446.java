package Ex1;

import java.util.Scanner;

public class Problem2446 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= (2*N - 1); i++)
			if(i <= N) 
			{
				for(int k = 1; k <= (i - 1); k++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= (2*N - 1 - 2 *(i -1)); j++) 
				{
					System.out.print("*");
				}
			System.out.println();
			}
			else 
			{
				for(int n = (2*N - 1 -i); n > 0; n-- ) 
				{
				System.out.print(" ");		
				}
				for(int L = 1; L <= (2* (i-N) + 1); L++)
				{
				System.out.print("*");
				}
			System.out.println();	
			}
		}
	}
