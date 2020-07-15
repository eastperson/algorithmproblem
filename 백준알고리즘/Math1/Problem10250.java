package Math1;

import java.util.Scanner;

public class Problem10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int floor = 1;
			if(N % H == 0) {
				floor = H;
			}
			else {
				floor = N % H;
			}
			int number = N / H + 1;
			 
			if (N%H == 0) {
				number = number - 1;
			}
			
			
			if(number < 10) {
				System.out.println(""+ floor + "0" + number);
			}
			else  {
				System.out.println("" + floor + number);
			}
			
		}
	}
}
