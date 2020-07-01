package 백준알고리즘;

import java.util.Scanner;

public class Problem8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length(); j++) {

				if(arr[i].charAt(j) == 'O') {
					int count2 = count2 + 1;
					if(arr[i].charAt(j) == arr[i].charAt(j-1)) {
						count2 = count2 + 1;
					}
					count = count2;
					count2 =0;
				}	
				
						
				}
				}
			}
			System.out.println(count);
			count = 0;
		}
	
				int f(int n) {
					int result *= n;
				}
		
	}

}

