package Function;

import java.util.Scanner;

class Function {

static int f(int n) {
	int a;
	int sum = 0;

	while(true) {
		
		if(n == 0) {
			return sum;
		}
		
		else {
		a = n % 10;
		n -= a;
		n /= 10;
		sum += a;
		}
	}
}

static int d(int x) {
	int result2;
	return result2 = x + Function.f(x);
	}
}



public class Problem4673 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10000];
		
		
		for(int i = 0; i < 10000; i++) {
			arr[i] = Function.d(i); 
		}
		
		boolean selfNumber = false;
		
		for(int i = 0; i < 10000; i++) {
			
			
			if(selfNumber) {
				System.out.println(i - 1);
				selfNumber = false;
			}
			
			for(int j = 0; j < 10000; j++) {
				if(i != arr[j]) {
					selfNumber = true;
					continue;
				}
				else if(i == arr[j]) {
					selfNumber = false;
					break;
				}
					
			}
		}
}
}
