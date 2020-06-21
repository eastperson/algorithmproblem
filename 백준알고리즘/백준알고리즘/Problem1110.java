package 백준알고리즘;

import java.util.Scanner;

public class Problem1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result2 = -1; // result2를 0으로 넣었다가 틀림
		int a = 0;
		
		/* ten + one = N
		 * ten2 + one = result
		 * one2 + result = result2
		 * result2의 값이 N과 같으면 종료.
		*/
		while(N != result2) {
			a = a + 1;
			if(result2 == -1) {
			    int one = N % 10;
		     	int ten = N % 100 - one;
		    	int ten2 = ten / 10;
			    int result = (ten2 + one) % 10;
			    int one2 = one * 10;
			    result2 = one2 + result;
			}
			else {
			    int one = result2 % 10;
		     	int ten = result2 % 100 - one;
		    	int ten2 = ten / 10;
			    int result = (ten2 + one) % 10;
			    int one2 = one * 10;
			    result2 = one2 + result;
				}
		}
		System.out.println(a);

	}

}

// 문제 풀 때 항상 예외의 값( N의 양 끝값을 고려하며 풀어야 한다. 해당 문제에서도 