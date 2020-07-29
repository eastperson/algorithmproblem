package bruteforce;

import java.util.Scanner;

class Person {
	int weight;
	int height;
	int rank = 1;
	Person(int weight, int height){
		this.weight = weight;
		this.height = height;
	}
}

public class Problem7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] personArr = new Person[n];
		
		for(int i = 0; i < personArr.length; i++) {
			int weight = sc.nextInt();
			int height = sc.nextInt();
			personArr[i] = new Person(weight, height);
		}
		
		for(int i = 0; i < personArr.length; i++) {
			for(int j = 0; j < personArr.length; j++) {
				if(i == j) {
					continue;
				} else if (personArr[j].weight > personArr[i].weight && personArr[j].height > personArr[i].height) {
					personArr[i].rank++;
				}
			}
		}
		
		for(int i = 0; i < personArr.length; i++) {
			System.out.print(personArr[i].rank + " ");
		}
		
	}

}
