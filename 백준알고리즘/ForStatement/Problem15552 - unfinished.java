package 백준알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] A = new int [T];
		int[] B = new int [T];
		
		for(int i = 0; i < T; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
			bw.write(A[i] + B[i] );
		}
			bw.flush();
			bw.close();
		}

	}

//https://coding-factory.tistory.com/251 - BufferedReader, BufferWriter 사용법
//https://dream-space.tistory.com/2 - BufferedReader, BufferWriter 사용법2
//https://www.acmicpc.net/problem/15552