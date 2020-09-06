package stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem9012 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt((sc.nextLine()));
		for(int i = 0; i < t; i ++) {
			String str = sc.nextLine();
			char[] chArr = str.toCharArray();
			stack.clear();
			int count = 0;
			for(int j = 0; j < chArr.length; j++) {
				stack.push(chArr[j]);
			}
			for(int j = 0; j < chArr.length; j++) {
				if(stack.get(stack.size()-1) == ')')
					count++;
				else
					count--;
				if(count >= 0)
				 stack.pop();
				else {
					System.out.println("NO");
					break;
				}
				if(stack.size() == 0 && count == 0) {
					System.out.println("YES");
					break;
				}
				if(stack.size() == 0 && count != 0) {					
					System.out.println("NO");
					break;
				}
			}
		} // end for
		
		
	}
}
