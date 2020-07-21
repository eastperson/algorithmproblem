package Math2;
import java.util.Scanner;

public class Problem1978 {
       
       public static void main(String[] args) {
              
              Scanner sc = new Scanner(System.in);
              int N = sc.nextInt();
              int[] arr = new int[N];
              int sum = 0;
              
              for(int i = 0; i < N; i++) {
                     arr[i] = sc.nextInt();
              }
              
              for(int i = 0; i < arr.length; i++) {
            	  for(int j = 1; j <= 1000; j++) {
            		  if(arr[i] % j == 0 && j != 1 && j != arr[i]) {
            			  break;
            		  }
            		  else if( arr[i] == 1) {
            			  break;
            		  }
            		  else if (arr[i] == j) {
            			  sum += 1;
            			  break;
            		  }
            		  
            	  }
            	  	
              }
              System.out.println(sum);
       }
       
}