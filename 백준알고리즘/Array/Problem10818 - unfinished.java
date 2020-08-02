package 백준알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] A = new int[N];
		
		for(int i=0; i < N; i++ ) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int tmp = 0;
		
		for(int i = 0; i < N - 1; i ++) {
			for(int j = 0; j < N - 1 - i; j++)
			{
				if(A[j] >= A[j+1]) {
					tmp = A[j+1];
					A[j+1] = A[j];
					A[j] = tmp;
				}
				else
				{
					continue;
				}
			}
		}

		bw.write(String.valueOf(A[0]));
		bw.newLine();
		bw.write(String.valueOf(A[N-1]));
		bw.flush();
		bw.close();
	}
}
