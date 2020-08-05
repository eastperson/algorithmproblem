package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2748 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		List listA = new ArrayList();
		
		listA.add(0L);
		listA.add(1L);
		
		for(int i = 0; i < 90; i++) {
			listA.add(Long.parseLong(listA.get(i).toString()) + Long.parseLong(listA.get(i+1).toString()));
		}
		
		System.out.println(listA.get(n));


	}

}
