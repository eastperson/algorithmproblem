package WhileStatement;

import java.util.Scanner;

public class Problem1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result2 = -1; // result2�� 0���� �־��ٰ� Ʋ��
		int a = 0;
		
		/* ten + one = N
		 * ten2 + one = result
		 * one2 + result = result2
		 * result2�� ���� N�� ������ ����.
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

// ���� Ǯ �� �׻� ������ ��( N�� �� ������ ����ϸ� Ǯ��� �Ѵ�. �ش� ���������� 