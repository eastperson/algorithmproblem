package stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Stack<Integer> stack = new Stack();
		for(int i = 0; i < k; i++) {
			int num = sc.nextInt();
			if(num == 0)
				stack.pop();
			else
				stack.add(num);
		}
		int sum = 0;
		
		for(int i = 0; i < stack.size(); i++) {
			sum += stack.get(i);
		}
	}
}
