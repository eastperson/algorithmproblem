package Array;
import java.util.Arrays;
import java.util.Scanner;

class Problem2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int[] arr2 = new int[9];
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr2 = Arrays.copyOf(arr, 9);
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] >= arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] == arr[arr.length - 1]) {
				result = i + 1;
				break;
			}
		}
		
		System.out.println(arr[arr.length - 1]);
		System.out.println(result);

	}

}
