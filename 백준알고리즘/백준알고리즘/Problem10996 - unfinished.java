package 백준알고리즘;

import java.util.Scanner;

public class Problem10996 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= 2*N; i++) 
		{
			if(i % 2 != 0)
			{
				for(int k = 1; k <= N-1; k++) 
				{
				System.out.println(" *");	
				}
			}
			else
			{
				
			}
		System.out.println();
		}

	}

}
