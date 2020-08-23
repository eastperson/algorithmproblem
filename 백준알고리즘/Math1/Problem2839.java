package Math1;

import java.util.Scanner;


public class Problem2839 {
	
	int count = 0;
	
	public int check5(int n) {
		if(n % 5 == 0) {
			count = n / 5;
			return n / 5;
		}
		if(n / 5 > 0) {
			count++;
			return n - 5;
		}
		return n - 5;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
		int result1 = n % 5;
		int result2 = n % 3;
		int result3 = n / 15;
		int fin = 0;
		int fin2 = 0;
		
		
		if(result3 > 0) {
			fin += n/5;
		}
			
		
		if(result1 == 0) {
			fin = n / 5;
		} else {
			if(result1 % 3 == 0) {
				fin = n/5 + (result1 / 3);
			} else {
				fin = -1;
			}
		}
		
		if(result2 == 0) {
			fin2 = n / 3;
		} else {
			if(result1 % 5 == 0) {
				fin2 = n/3 + (result2 / 5);
			} else {
				fin2 = -1;
			}
		}
		
		int result = fin < fin2 ? fin : fin2;
		if(fin == -1 || fin2 == -1) {
			result = fin > fin2 ? fin : fin2;
		}
		System.out.println(result);
		
	}
}
