package ForStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(""+(a+b));
			bw.newLine();
		}
			bw.flush();
			bw.close();
		}
	}

//https://coding-factory.tistory.com/251 - BufferedReader, BufferWriter ����
//https://dream-space.tistory.com/2 - BufferedReader, BufferWriter ����2
//https://www.acmicpc.net/problem/15552