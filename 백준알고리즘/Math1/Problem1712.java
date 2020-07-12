package Math1;

import java.util.Scanner;

public class Problem1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long fixedCost = sc.nextInt();
		long productionCost = sc.nextInt();
		long lapTopPrice = sc.nextInt();
		long gap = productionCost - lapTopPrice;
		
		if(productionCost > lapTopPrice || -1 < gap && gap < 1) {
			System.out.println(-1);
		}
		else {
			System.out.println(-(fixedCost / gap) +1);
		}
	}

}
