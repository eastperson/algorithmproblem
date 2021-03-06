package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2748 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		List listA = new ArrayList();
		
		listA.add(0L);
		listA.add(1L);
		
		for(int i = 0; i < 90; i++) {
			listA.add(Long.parseLong(listA.get(i).toString()) + Long.parseLong(listA.get(i+1).toString()));
		}
		
		System.out.println(listA.get(n));


	}

}
/*
package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1003 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		for(int i = 3; i <= 40; i++) {
			int num = list.get(i-1) + list.get(i-2);
			list.add(num);
		}
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if(n == 0) {
				System.out.println(1 + " " + 0);
			} else if( n == 1) {
				System.out.println(0 + " " + 1);
			} else {
				int zeroCount = list.get(n-2);
				int oneCount = list.get(n-1);
				System.out.println(zeroCount + " " + oneCount);				
			}
		}
		

	}

}


*/