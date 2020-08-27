package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i ++) {
			list.add(sc.nextInt());
		}
		
		list(n-1) + list(n-2) > list(n-1) + list(n-3)

	}

}
