package Math2;

import java.util.Scanner;

public class Problem1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			double r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			double r2 = sc.nextInt();
		
			
			int result = getDistanceBetweenPoint(x1, y1, r1, x2, y2, r2);
			System.out.println(result);
			
			break;
		}
		
		
		

	}
	
	
	
	private static int getDistanceBetweenPoint(int x1, int y1, double r1, int x2, int y2, double r2) {
		
		int x3 = 0;
		int y3 = 0;
		int result = 0;
		
		r1 = Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2);
		r2 = Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2);
		
		return result;
	}

}
