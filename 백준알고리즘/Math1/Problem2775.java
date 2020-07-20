package Math1;

import java.util.Scanner;

public class Problem2775 {
	
	public static int el(int k, int n) {
        if (n == 0)
            return 0;
        else if (k == 0)
            return n;
        else {
            return el(k, n - 1) + el(k - 1, n);
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int test = 0;
		
		
		while(test < T) {
			test++;
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(el(k, n));
			
		}

	}

}
