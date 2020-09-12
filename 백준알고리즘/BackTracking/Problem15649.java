package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem15649 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		// 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
		// -1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
		// 일단 리스트를 만들자.
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < m; i++) {
			
			System.out.print(list);
		}
		
		// 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
		// 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
	}

}
