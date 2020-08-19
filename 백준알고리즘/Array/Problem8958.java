package Array;

import java.util.Scanner;

public class Problem8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		

		
		for(int i = 0; i < n; i++) {
			
			int cursor = 0;
			int score = 0;
			
			String str = sc.nextLine();
			char[] arr = new char[str.length()];
			arr = str.toCharArray();
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == 'O') {
					cursor++;
					score += cursor;
				} else if(arr[j] == 'X') {
					cursor = 0;
				}
			}
			
			System.out.println(score);
		}
		
		
	}

}

