package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem2108 {
	
	public static void main(String[] args) {
		// N�� Ȧ��
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i ++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		// ������ : N���� ������ ���� N���� ���� ��
		System.out.println(sum/list.size());
		
		
		// �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� �����ϴ� ��
		int a = (int) (list.size()/2);
		System.out.println(list.get(a));
		
		// �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
		Collections.
		
		
		// ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		System.out.println(list.get(list.size()-1) - list.get(0));
		

	}

}
