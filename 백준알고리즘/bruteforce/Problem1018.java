package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

class Board {
	Scanner sc = new Scanner(System.in);
	
	int width;
	int height;
	int[][] arr;
	
	public Board(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Board [width=" + width + ", height=" + height + ", arr=" + Arrays.toString(arr) + "]";
	}
	
	public void generateBoard(Scanner sc) {
		this.arr = new int[this.width][this.height];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int n = 0;
				if(sc.next().equalsIgnoreCase("B")) {
					n = 1;
				} else if (sc.next().equalsIgnoreCase("W")) {
					n = 0;
				}
				arr[i][j] = n;
			}
		}
	}
	
	
}


public class Problem1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		Board b = new Board(m, n);
	
			b.arr = new int[m][n];
			for(int i = 0; i < b.arr.length; i++) {
				for(int j = 0; j < b.arr[i].length; j++) {
					int k = 0;
					if(sc.nextLine().charAt(j) == 'W') {
						k = 1;
					} else if (sc.nextLine().charAt(j) == 'B') {
						k = 0;
					}
					b.arr[i][j] = k;
				}
			}
			
			System.out.println(Arrays.deepToString(b.arr));
		}
		
//		b.generateBoard(sc);
		

	}
