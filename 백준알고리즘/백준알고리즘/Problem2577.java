package 백준알고리즘;

import java.util.Scanner;

public class Problem2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A*B*C;
		
		
		String number = Integer.toString(result);
		
		int[] arr = new int[number.length()];
		
		for(int i = 0; i < number.length(); i++) {
		char ch = number.charAt(i);
		arr[i] = (int) ch - '0';
		}
		
		int[] numberUnit = new int[10];
		int count = 0;
		
		for(int i = 0; i < numberUnit.length; i++) {
			numberUnit[i] = i;
		}
		
		
		for(int i = 0; i < numberUnit.length; i++) {
			for(int j = 0; j < arr.length; j++) {
			if(numberUnit[i] == arr[j]) {
				count += 1;
				
			}
				
			}
			System.out.println(count);
			count = 0;
		}
	}

}

