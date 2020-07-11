package 백준알고리즘;

import java.util.Scanner;

public class Problem1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int notGroupCount = 0;
		int testCase = 0;

		
		
		while(true) {
			testCase++;
			if(testCase > T) {
				break;
			}
			
			char[] abc = new char[26];
			for(int i = 0; i < abc.length; i++) {		// abc 배열 생성
				abc[i] = (char) ('a' + i);
			}
			
			String S = sc.nextLine();
			char[] ch = new char[S.length()];
			
			for(int i = 0; i < S.length(); i++) {		// ch 배열 생성
				ch[i] = S.charAt(i);
			}
			
			for(int i = 0; i < S.length() - 1; i++) {	// 중복 문자열 제거
				if(ch[i] == ch[i+1]) {
					ch[i] = 0;
				}
			}
			
			for(int i = 0; i < S.length(); i++) {
				for(int j = 0; j < abc.length; j++) {
					if(ch[i] == abc[j]) {
						ch[i] = '0';
						abc[j] = '0';
						break;
					}
					
				}
				
			}
			for(int i = 0; i < abc.length; i++) {
				abc[i] = (char) ('a' + i);
			}
			
			
			
	Loop1 :		for(int i = 0; i < S.length(); i++) {
				for(int j = 0; j < abc.length; j++) {
					if(ch[i] == abc[j]) {
					notGroupCount++;
					break Loop1;
					}
			}
			
			
			
		}
		}
		System.out.println(T - notGroupCount);
	}
}
