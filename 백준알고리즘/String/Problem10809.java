package String;

import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		char[] ch = new char[S.length()];
		char[] abc = new char[26];
		
		for(int i = 0; i < S.length(); i++) {
			ch[i] = S.charAt(i);
		}
		
		
		
		for(int i = 0; i < 26; i++) {
			abc[i] = (char) ('a' + i);
		}
		
		for(int i = 0; i < abc.length; i++)  {
			int count = 0;
			for(int j = 0; j < ch.length; j++) {
				
				if(abc[i] == ch[j]) {
					System.out.print(j + " ");
					break;
				}
				else if (abc[i] != ch[j]) {
					count++;
					if(count == ch.length) {
						System.out.print(-1 + " ");
						break;
					}
				}
			}
		}
	}
}
