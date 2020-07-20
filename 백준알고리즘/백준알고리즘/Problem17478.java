package 백준알고리즘;

import java.util.Scanner;

public class Problem17478 {
	
	private static void function(int N, int K) {
		
		if(N <= 1) {
		
			if(N == K) {
				System.out.println("____\"재귀함수가 뭔가요?\"");
				System.out.println("____\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			}
			else {
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"재귀함수가 뭔가요?\"");
				
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			}
		}
		else {
			function(N - 1, K);
			for(int i = 0; i < N; i++)
				System.out.print("____");
			System.out.println("\"재귀함수가 뭔가요?\"");
			if(N == K) {
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			}
			else {
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
				for(int i = 0; i < N; i++)
					System.out.print("____");
				System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			}
		}
	}
	private static void function2(int N) {
		if(N >= 1) {
			for(int i = 0; i < N; i++)
				System.out.print("____");
			System.out.println("라고 답변하였지.");
			function2(N - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		System.out.println("\"재귀함수가 뭔가요?\"");
		System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		function(N, N);
		function2(N);
		System.out.println("라고 답변하였지.");
	}
}
