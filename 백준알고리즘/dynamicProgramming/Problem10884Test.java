package dynamicProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem10884Test {

	@Test
	public static int getCount(int num) {
		int count = 0;
		if(num == 0) {
			return 0;
		}
		for(int i = 0; i < num; i++) {
			String str = String.valueOf(num);
			int a = str.toCharArray()[str.length()-1] -'0';
			if(a == 0 || a== 9)
				count++;
		}
		return count;
	}
}
