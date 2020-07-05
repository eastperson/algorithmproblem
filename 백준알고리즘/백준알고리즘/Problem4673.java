package 백준알고리즘;

public class Problem4673 {

	public static void main(String[] args) {
		
		
		int n = (int) Math.random()*10000 + 1;
		int result = 0;
		int x = 10;
		int a = 1;
		int sum = 0;
		
		
		int f() {
		while(true) {
			
			if(a == 0) {
				return sum;
				break;
			}
			
			else {
			a = n %= x;
			sum += a;
			x *= 10;
			}
		}
		}
		
		
		
		
		
	}

}
