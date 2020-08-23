package RecursiveFunction;

import java.util.Scanner;

public class Problem2447 {
	
	public static String first(String input, int n) {
		
		String first = "";
		for(int i = 0; i < n; i++) {
			first += input;
		}
		
		return first;
	}
	
	public static String second(String input, int n) {
		String second = "";
		for(int i = 0; i < n; i++) {
			if(i%3 == 1) {
				second += input.replace(input, " ");
				continue;
			}
			second += input;
		}
		return second;
	}
	
	public static String merge(String input, int n) {
		String first = first(input, n);
		String second = second(input, n);
		String third = first(input, n);
		
		return first +"\n"+second+"\n"+third+"\n";
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = merge("*", n);
		result = merge(result, n/3);
		System.out.println(result);
	
	}

}
