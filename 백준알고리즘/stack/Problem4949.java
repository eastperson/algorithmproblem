package stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem4949 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			char[] chArr = str.toCharArray();
			stack.clear();
			int count1 = 0;
			int count2 = 0;
			for(int j = 0; j < chArr.length; j++) {
				if(chArr[j] == '(' || chArr[j] == ')' || chArr[j] == '[' || chArr[j] == ']' || chArr[j] == '.')
					stack.push(chArr[j]);
			}
			if(stack.get(stack.size()-1) != '.') {
				System.out.println("NO");
				continue;
			}
			if(str.length() != 1 && stack.size() == 1 && stack.get(stack.size()-1) == '.') {
				System.out.println("YES");
				continue;
			}
			if(str.length() == 1 && stack.size() == 1 && stack.get(stack.size()-1) == '.') {
				break;
			}
			stack.pop();
			while(true) {
				if(stack.get(stack.size()-1) == ')')
					count1++;
				
				if (stack.get(stack.size()-1) == '(')
					count1--;
					
				if(stack.get(stack.size()-1) == ']')
					count2++;
				
				if(stack.get(stack.size()-1) == '[')
					count2--;
				
				if(count1 >= 0 && count2 >= 0)
					 stack.pop();
				else {
						System.out.println("NO");
						break;
				}
				
				if(stack.size() == 0 && count1 == 0 && count2 == 0) {
						System.out.println("YES");
						break;
				}
				
				if(stack.size() == 0 && count1 != 0 && count2 != 0) {					
						System.out.println("NO");
						break;
				}
			}
		} // end for
	}
}
