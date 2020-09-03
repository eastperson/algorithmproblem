package stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		int n = Integer.parseInt(sc.nextLine());
		
		CharSequence push = "push";
		CharSequence top = "top";
		CharSequence size = "size";
		CharSequence empty = "empty";
		CharSequence pop = "pop";
		
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine().trim().replace(" ", "");
			
			if(input.contains(push))
				stack.push(input.substring(push.length(), input.length()));
			
			if(input.contains(top)) {
				if(stack.size() == 0)
					System.out.println(-1);
				else
					System.out.println(stack.get(stack.size()-1));
				
				continue;
			}
			
			if(input.contains(size)) {
				System.out.println(stack.size());
				continue;
			}
			
			if(input.contains(empty)) {
				if(stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				continue;
			}
			
			if(input.contains(pop)) {
				if(stack.empty())
					System.out.println(-1);
				else {
					System.out.println(stack.get(stack.size()-1));
					stack.pop();
				}
				continue;
			}
		}	
		
	}
}
