package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class StrLength implements Comparable<StrLength> {
	
	private String str;
	private int length;
	public StrLength(String str) {
		super();
		this.str = str;
		this.length = str.length();
	}
	
	public String getStr() {
		return str;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		
		
		
		
		result = prime * result + length;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return this.str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		StrLength other = (StrLength) obj;
		if (length != other.length)
			return false;
		if (this.str.equals(other.str)) {
			return true;
		}
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}

	@Override
	public int compareTo(StrLength o) {
		if(this.length > o.length) {
			return 1;
		} else if (this.length < o.length) {
			return -1;
		} else if(this.length == o.length) {
			List<String> list = new ArrayList<>();
			list.add(this.str);
			list.add(o.str);
			Collections.sort(list);
			if(list.get(0).equals(this.str)) {
				return -1;
			} else if(list.get(0).equals(o.str)) {
				return 1;
			}
		}
		return 0;
	}
}

public class Problem1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<StrLength> list = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
	Loop1 :	for(int i = 0; i < t; i++) {
			StrLength str = new StrLength(sc.nextLine());
			for(int j = 0; j < list.size(); j++) {
				if(str.getStr().equals(list.get(j).getStr())){
					continue Loop1;
				}
			}
			list.add(str);
		}
		
		Collections.sort(list);
		
		for(StrLength sl : list) {
			System.out.println(sl.getStr());
		}
	}

}
