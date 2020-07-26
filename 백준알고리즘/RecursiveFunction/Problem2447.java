package RecursiveFunction;

public class Problem2447 {
	
	public static void f(int N) {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == (int) N/2 && j == (int) N/2) {System.out.print(" ");}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void f()
	
	
	public static void main(String[] args) {
		f(3);

	}

}
