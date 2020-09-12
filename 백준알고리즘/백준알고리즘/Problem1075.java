package 백준알고리즘;

import java.util.Scanner;

public class Problem1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		int min = 100;
		for(int i = 1; i <= 100; i++ ) {
			if(n % 100 == 0 && i != 1) {
				n -= 100;
			}
			if(n % f == 0) {
				String str = String.valueOf(n);
				char[] chArr = str.toCharArray();
				str = String.valueOf(chArr[chArr.length-2]) + String.valueOf(chArr[chArr.length-1]);
				int num = Integer.parseInt(str);
				if(min > num) {
					min = num;
				}
			}
			n++;
		}
		
		if(min < 10) {
			 System.out.println("0"+ String.valueOf(min));
		} else {
			System.out.println(min);
		}
	}
}
