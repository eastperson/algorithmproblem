package Math2;

import java.util.Scanner;

public class Problem2581 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N;
        
        for(int i = M; i <= N; i++) {
        	for(int j = 1; j <= i; j++) {
      		  if(i % j == 0 && j != 1 && j != i) {
      			  break;
      		  }
      		  else if(i == 1) {
      			  break;
      		  }
      		  else if (i == j) {
      			  sum += i;
      			  break;
      		  }
      		  
      	  }
      	  	
        }
        if(sum != 0) {      
  Loop :for(int i = M; i <= N; i++) {
        	for(int j = 1; j <= i; j++) {
      		  if(i % j == 0 && j != 1 && j != i) {
      			  break;
      		  }
      		  else if(i == 1) {
      			  break;
      		  }
      		  else if (i == j) {
      			  min = i;
      			  break Loop;
      		  }
      		  
      	  }
      	  	
        }
        System.out.println(sum);
        System.out.println(min);

        }
        else {
        	System.out.println(-1);
        }
                

	}

}
