package 백준알고리즘;

import java.util.Scanner;

public class Problem2609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int MaxA = A, MaxB = B, Max = 0;
		int MinA = A, MinB = B, Min = 0;
		boolean flag = true;
		
		if(A >= B) {
			Max = A;
		}
		else {
			Max = B;
		}
		
		int k = Max + 1;
		while(flag) {
			k--;
			if(A % k == 0 && B % k ==0) {
				Max = k;
				flag = false;
			}
			else {
				continue;
			}
		}
		
		flag = true;
		int i = 0;
		while(flag) {
			++i;
			MinA = A;
			MinA = MinA*i;
			for(int j=1; j <= A; j++) {
				MinB = B;
				MinB = MinB*j;
				if(MinA == MinB)
				{
					Min = MinA;
					flag = false;
					break;
				}
				else if (MinB > MinA)
				{
					break;
				}
				{
					continue;
				}
			
			}
		}
		
		System.out.println(Max);
		System.out.println(Min);

	}

}
