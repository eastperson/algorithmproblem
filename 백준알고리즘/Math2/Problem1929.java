package Math2;

import java.util.Scanner;

public class Problem1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		if(N >= 2 && M <= 2) {
			System.out.println(2);
		}
		
		if(N >= 3 && M <=3 ) {
			System.out.println(3);
		}

		if(N >= 5) {
		for(int i = 1; i <= (int) (N/6 + 1); i++) {
			if(M <= 6*i-1 && 6*i-1 <= N) {
				for(int j = 1; j <= (6*i-1) / 2 + 1; j++) {
		      		  if((6*i-1) % j == 0 && j != 1 && (j != (6*i-1))) {
		      			  break;
		      		  }
		      		  
		      		  else if (j == (6*i-1)) {
		      			  System.out.println(6*i-1);
		      			  break;
		      		  }
			} 
			
			if(M <= 6*i + 1 && 6*i +1 <= N) {
				for(int j = 1; j <= (6*i+1) / 2 + 1; j++) {
				  if((6*i+1) % j == 0 && j != 1 && (j != (6*i+1))) {
	      			  break;
	      		  }
	      		  
	      		  else if (j == (6*i+1)) {
	      			  System.out.println(6*i+1);
	      			  break;
	      		  }
				}
			}
		}
		}
	}
	}
	}
		
		/*
		if(M < 4) {
			 for(int i = M; i <= N; i++) {
		        	for(int j = 1; j <= (int) (i / 2) + 1; j++) {
		      		  if(i % j == 0 && j != 1 && j != i) {
		      			  break;
		      		  }
		      		  else if(i == 1) {
		      			  break;
		      		  }
		      		  else if (j == (int) (i / 2) + 1) {
		      			  System.out.println(i);
		      			  break;
		      		  }
		      		  
		      	  }
			 }
		}
	
		else {
			 for(int i = M; i <= N; i++) {
		        	for(int j = 1; j <= (int) (i / 2) + 1; j++) {
		      		  if(i % j == 0 && j != 1 && j != i) {
		      			  break;
		      		  }
		      		  else if(i == 1) {
		      			  break;
		      		  }
		      		  else if (j == (int) (i / 2) + 1) {
		      			  System.out.println(i);
		      			  break;
		      		  }
		      		  
		      	  }
			 }
		}
		}

}
*/

/* 
�Ҽ��� Ư¡)

	�Ҽ��� 1���� ū �ڿ����Դϴ�. ��, 1�� �Ҽ��� �ƴմϴ�.
	�Ҽ��� �ڱ��ڽŰ� 1�� ����� �����ϴ�. ��, �Ҽ��� ����� �� 2�� �ֽ��ϴ�. ���� �����մϴ�.
	2�� �Ҽ��Դϴ�.
	������, �ٸ� ��� ¦���� 2�� ����� �����Ƿ� �Ҽ��� �ƴմϴ�. *** 2��° ����Ʈ(�Ҽ��� ����� �������� ����)
	2, 3�� ������ ��� �Ҽ��� �ڿ��� n�� ���� 6n-1 Ȥ�� 6n+1 ���Դϴ�. ���� �������� �ʽ��ϴ�.
*/



