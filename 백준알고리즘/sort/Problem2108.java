package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Value { int value = 0; }

public class Problem2108 {
	
	public static void main(String[] args) {
		// N�� Ȧ��
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new TreeSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i ++) {
			int num = sc.nextInt();
			list.add(num);
			
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}
			
			else {
				int value = (int) map.get(num);
				map.put(num, value+1);
			}
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		// ������ : N���� ������ ���� N���� ���� ��
		System.out.println((int) (Math.round(sum/list.size())));
		
		
		// �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� �����ϴ� ��
		int a = (int) (list.size()/2);
		System.out.println(list.get(a));
		
		// �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
		int max = 0;
		int maxIdx = 0;
		for(int i = 0; i < list.size(); i++) {
			int idx = list.get(i);
			if(max < map.get(idx)) {
				max = map.get(idx);
				maxIdx = idx;
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			int idx = list.get(i);
			if(max == map.get(idx)) {
				set.add(idx);
			}
		}
		
		
//		if(map.get(0) == map.get(1))
//		
//		
		Iterator it = set.iterator();
		it.next();
		if(set.size() >= 2) 
			System.out.println(it.next());
		else
			System.out.println(maxIdx);
		
		// ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		System.out.println(list.get(list.size()-1) - list.get(0));
		

	}

}
