package ���ؾ˰���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= T; i++ ) {
			int A = Integer.parseInt(bf.readLine());
			int B = Integer.parseInt(bf.readLine());

			bw.write(A + B + "\n");
			bw.flush();
		}

	}

}

//https://coding-factory.tistory.com/251 - BufferedReader, BufferWriter ����
//https://dream-space.tistory.com/2 - BufferedReader, BufferWriter ����2
//https://www.acmicpc.net/problem/15552