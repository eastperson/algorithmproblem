package Grid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem110407 {
	public static void main(String[] args) {
		
		// 입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cost = k;
		
		// 코인의 종류를 순서로 나열, 코인 리스트
		List<Integer> coinList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			coinList.add(sc.nextInt());
		}
		
		List<Integer> coinList2 = coinList.stream().filter((i) -> k > i).collect(Collectors.toList());
		int idx = coinList2.size()- 1;
		int max = coinList2.get(idx);
		int count = 0;
		while(cost > 0) {
			if(cost >= max) {
				cost -= max;
				count++;
			} else if (cost < max) {
				max = coinList2.get(--idx);
			}
		}
		
		System.out.println(count);
		
		
		
		// 필터작업
		
		
		
	}
}
