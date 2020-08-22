package Math1;

import java.util.Scanner;

class Sugar {
	int weight;

	public Sugar(int weight) {
		super();
		this.weight = weight;
	}
	
	
}

class Bag {
	int amount;

	public Bag(int amount) {
		super();
		this.amount = amount;
	}
	
	
}

public class Problem2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sugar s5 = new Sugar(5);
		Sugar s3 = new Sugar(3);
		Bag b5 = new Bag(5);
		Bag b3 = new Bag(3);
		int n = sc.nextInt();
			
		int result1 = n % 5;
		int result2 = n % 3;
		int fin;
		int fin2;
		
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
