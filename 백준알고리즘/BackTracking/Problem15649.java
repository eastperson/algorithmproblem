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
		
		// �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// -1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
		// �ϴ� ����Ʈ�� ������.
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < m; i++) {
			
			System.out.print(list);
		}
		
		// �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.
		// ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
	}

}
