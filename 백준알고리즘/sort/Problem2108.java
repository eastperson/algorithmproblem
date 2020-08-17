package sort;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem2108 {
	
	public static void main(String[] args) {
		Set set = new TreeSet();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; set.size() < n; i++) {
			set.add(new Integer(sc.nextInt()));
		}
		
		
		
//		Iterator it = set.iterator();
//		
//		while (it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
	}

}
