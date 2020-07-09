package 백준알고리즘;

import java.util.Scanner;

public class Problem1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] ch = new char[S.length()];
		int[] Max = new int[S.length()];
		int max = 0;
		final int M = 32;
		char maxAlphabet = 0;
		boolean end = true;
		
		
		for(int i = 0; i < S.length(); i++) {
			if('a' <= S.charAt(i) && S.charAt(i) <= 'z') {
				ch[i] = (char) (S.charAt(i) - M);
			}
			else if ('A' <= S.charAt(i) && S.charAt(i) <= 'Z') {
				ch[i] = S.charAt(i);
			}
		}
		
		for(int i = 0; i < S.length(); i++) {
			int count = 0;
			for(int j = 0; j < S.length(); j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
			Max[i] = count;
		}
		
		for(int i = 0; i < S.length(); i++) {
			if(max < Max[i]) {
				max = Max[i];
				maxAlphabet = ch[i];
			}
				
			if(max == Max[i]) {
					if(maxAlphabet != ch[i]) {
						System.out.println("?");
						end = false;
						break;
					}

			}
		}
		if(end) {
			System.out.println(maxAlphabet);
		}
		

	}

}
