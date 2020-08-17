package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chArr = new char[str.length()];
		str.getChars(0, str.length(), chArr, 0);
		Arrays.parallelSort(chArr);
		for(int i = chArr.length-1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
	}
}
