package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem9461 {
	
	static List<Long> list;
	
	static {
		list = new ArrayList<>();
		list.add(0L);
		list.add(1L);
		list.add(1L);
		list.add(1L);
		list.add(2L);
		list.add(2L);
		for(int i = 6; i <= 100; i++) {
			list.add(list.get(i-1)+list.get(i-5));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i = 0; i < t; i ++) {
			int n = sc.nextInt();
			System.out.println(list.get(n));
		}
	}

}
