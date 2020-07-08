package 백준알고리즘;

import java.util.Scanner;

public class Problem11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] arr = new int[N];
		
		String s = sc.nextLine();
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = (int) (s.charAt(i) - '0');
			sum += arr[i];
		}
		
		System.out.println(sum);

	}
}
