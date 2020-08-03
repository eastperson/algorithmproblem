package basic100;

import java.util.Scanner;

public class basic_ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int tmp = num;
		
		int count = 1;
		while(num != 0) {
			num = (int) (num - (num % Math.pow(10, count)));
			count++;
		}
		
		
		num = tmp;
		int[] numArr = new int[count-1];
		int i = 0;
		while(num != 0) {
			numArr[i] = ((int) (num % Math.pow(10, i+1)));
			num = num - numArr[i];
			i++;
		}
		
		for(int j = numArr.length - 1; j >= 0; j--) {
			System.out.println("["+numArr[j]+"]");
		}
		
	}
}
