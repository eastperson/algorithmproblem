package Math1;

import java.util.Scanner;

public class Problem2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long result = 0;
		long sum = 2;
		long sum2 = 0;
		
		if(N == 1) {
			result = 1;
		}
		else if(2 <= N && N <= 7) {
			result = 2;
		}
		else { 
			for(long i = 1; i <= N; i++) 
			{
				sum += 6*i;
				sum2 = sum + 6*(i+1);
				if(sum <= N && N < sum2) {
					result = i + 2;
					break;
				}
			}
			
		
		}
		
		System.out.println(result);
	}

}
