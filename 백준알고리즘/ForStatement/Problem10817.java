package ForStatement;

import java.util.Scanner;

public class Problem10817 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] ABC = {A, B, C};
		
		for(int i = 0; i < 2; i++) {
			if(ABC[i] < ABC[i + 1]) {
				int tmp = ABC[i +1];
				ABC[i + 1] = ABC[i];
				ABC[i] = tmp;
				i = -1;
			}
			else if(ABC[i] == ABC[i + 1]) {
				i++;
				continue;
			}
			else {
				continue;
			}
		}
		System.out.println(ABC[1]);

	}

}
