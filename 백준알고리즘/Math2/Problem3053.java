package Math2;

import java.util.Scanner;

public class Problem3053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextInt();
		
		//��Ŭ���� ������
		
		double circle = R*R*Math.PI;
		double ho = circle - R*R/2*4;
		double result = circle - ho;
		
		float result1 = (float) (Math.round((circle)*1000000))/1000000;
		float result2 = (float) (Math.round(result*1000000))/1000000;
		
		System.out.printf("%f\n",result1);
		System.out.printf("%f", (result2));

	}

}
