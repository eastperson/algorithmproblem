package String;

import java.util.Scanner;

public class Problem1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < S.length(); i++) {
			if(' ' == S.charAt(i)){
				count++;
				if(i == S.length() - 1 || i == 0) {
					count--;
				}

			}
		}
		if(S.length() == 0) {
			System.out.println(count);
		}
		else if(S.length() == 1 && S.charAt(0) == ' ') {
			System.out.println(count);
		}
		
		else {
			System.out.println(count + 1);
		}
	}

}
