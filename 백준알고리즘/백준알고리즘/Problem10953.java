package 백준알고리즘;

import java.util.Scanner;

public class Problem10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < t; i++) {
			String str = sc.nextLine();
			String[] strArr = str.split(",");
			System.out.println(Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1]));
			
		}
		

	}

}
