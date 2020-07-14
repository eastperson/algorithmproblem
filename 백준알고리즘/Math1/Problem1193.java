package Math1;

import java.util.Scanner;

public class Problem1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = 0;
		for(int i = 2; i < X; i++) {
			if(X == 1) {
				N =1 ;
				break;
			}
			else if( ((i-1)*(i-1) + (i-1)) / 2 <  X && X <= (i*i + i) / 2) {
				N = i;
				break;
			}
		}
		
		int order = ((N*N + N) / 2) - X;
		int resultUp = (N - order);
		int resultDown = (1 + order);
		if(X == 1) {
			System.out.println(1 + "/" + 1);
		}
		else if (X == 2) {
			System.out.println(1 + "/" + 2);
		}
		else if(N % 2 == 0) {
			System.out.println(resultUp + "/" + resultDown);
		}
		else {
			System.out.println(resultDown + "/" + resultUp);
		}
		
	}

}
