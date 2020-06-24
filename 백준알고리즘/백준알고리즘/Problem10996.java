package 백준알고리즘;

import java.util.Scanner;

 

public class Problem10996 {


	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= 2*N; i++) {
			
			if(i % 2 == 1) {
				for(int j = 1; j <= (int) (N + 1) / 2; j++)
				{
					System.out.print("* ");
				}
			}
			
			else {
				for(int j = 1; j <= (int) N / 2; j++)
				{
					System.out.print(" *");
				}
			}
			System.out.println();
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		
//
//		for(int b = 1; b <= N; b ++)
//		{
//			if(N == 1)
//			{
//				System.out.print("*");
//			}
//			else if (N % 2 != 0)
//			{
//				if(N % 2 != 0) // N이 홀수 일 때
//				{
//					System.out.print("*");
//					for(int i = 1; i <= (int) N / 2; i++ ) 
//					{
//					System.out.print(" *");
//					}
//				}
//				else // N이 짝수 일 때
//				{
//					for(int i = 1; i <= (int) N / 2; i++ )
//					{
//						System.out.print(" *");	
//					}
//				}
//			}
//			System.out.println();
//			}	
