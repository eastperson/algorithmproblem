package Grid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem110407 {
	public static void main(String[] args) {
		
		// �Է�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cost = k;
		
		// ������ ������ ������ ����, ���� ����Ʈ
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
		
		
		
		// �����۾�
		
		
		
	}
}
