package 백준알고리즘;

import java.util.Scanner;

public class Problem2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] ch= new char[S.length()];
		int count = 0;
		int count2 = 0;
		
		for(int i = 0; i < S.length(); i++) {
			ch[i] = S.charAt(i);
		}
		
		for(int i = 0; i < S.length() - 1; i++) {
			if(0 < i && "dz=".equals((ch[i - 1] + "") + (ch[i] + "") + (ch[i+1] + ""))) {
						count2++;
			}
			
			switch((ch[i] + "") + (ch[i+1] + "")) {
			case "c=" :
			case "c-" :
			case "d-" :
			case "s=" :
			case "z=" :
			case "lj" :
			case "nj" :
				count++;
				break;
			default :
				break;
			}
		}
		
		System.out.println(S.length() - count - count2);

	}

}
