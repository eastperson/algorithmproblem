package RecursiveFunction;

public class Problem2447 {
	
	public static void p() {
		System.out.println("*");
	}
	
	
	public static void f() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) {p();}
				else {p();}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		f("*");

	}

}
