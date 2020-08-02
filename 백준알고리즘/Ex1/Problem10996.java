package Ex1;

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
//				if(N % 2 != 0) // NÀÌ È¦¼ö ÀÏ ¶§
//				{
//					System.out.print("*");
//					for(int i = 1; i <= (int) N / 2; i++ ) 
//					{
//					System.out.print(" *");
//					}
//				}
//				else // NÀÌ Â¦¼ö ÀÏ ¶§
//				{
//					for(int i = 1; i <= (int) N / 2; i++ )
//					{
//						System.out.print(" *");	
//					}
//				}
//			}
//			System.out.println();
//			}	
