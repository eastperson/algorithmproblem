package ���ؾ˰���;

import java.util.Scanner;

public class Problem17478 {
	
	private static void function(int N, int K) {
		
		if(N <= 1) {
		
			if(N == K) {
				System.out.println("____\"����Լ��� ������?\"");
				System.out.println("____\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			}
			else {
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"����Լ��� ������?\"");
				
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			}
		}
		else {
			function(N - 1, K);
			for(int i = 0; i < N; i++)
				System.out.print("____");
			System.out.println("\"����Լ��� ������?\"");
			if(N == K) {
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			}
			else {
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			}
		}
	}
	private static void function2(int N) {
		if(N >= 1) {
			for(int i = 0; i < N; i++)
				System.out.print("____");
			System.out.println("��� �亯�Ͽ���.");
			function2(N - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		System.out.println("\"����Լ��� ������?\"");
		System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		function(N, N);
		function2(N);
		System.out.println("��� �亯�Ͽ���.");
	}
}
