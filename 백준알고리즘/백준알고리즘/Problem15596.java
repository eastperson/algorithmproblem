package 백준알고리즘;

public class Problem15596 {
	
    long sum(int[] a) {
        long ans = 0;

		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
        return ans;
    }
}
