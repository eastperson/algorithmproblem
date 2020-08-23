package Math2;

import java.util.Scanner;

public class Problem1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
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
*/

/* 
소수의 특징)

	소수는 1보다 큰 자연수입니다. 즉, 1은 소수가 아닙니다.
	소수는 자기자신과 1만 약수로 가집니다. 즉, 소수는 약수가 딱 2개 있습니다. 역도 성립합니다.
	2는 소수입니다.
	하지만, 다른 모든 짝수는 2를 약수를 가지므로 소수가 아닙니다. *** 2번째 포인트(소수의 배수를 범위에서 제외)
	2, 3을 제외한 모든 소수는 자연수 n에 대해 6n-1 혹은 6n+1 꼴입니다. 역은 성립하지 않습니다.
*/



