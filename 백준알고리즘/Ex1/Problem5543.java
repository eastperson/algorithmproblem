package Ex1;

import java.util.Scanner;

public class Problem5543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] buger = new int[3];
		int[] beverage = new int[2];
		
		int minbuger = 2000;
		int minbeverage = 2000;
		
		for(int i = 0; i < buger.length; i++) {
			buger[i] = sc.nextInt();
		}
		
		for(int i = 0; i < beverage.length; i++) {
			beverage[i] = sc.nextInt();

		}
		
		for(int i = 0; i < buger.length; i++) {
			if(minbuger > buger[i]) {
				minbuger = buger[i];
			}
		}
		
		for(int i = 0; i < beverage.length; i++) {
			if(minbeverage > beverage[i]) {
				minbeverage = beverage[i];
			}
		}
		
		int minSet = minbuger + minbeverage - 50;
		
		System.out.println(minSet);
	}
}

