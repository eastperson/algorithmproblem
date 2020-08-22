package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Alphabet implements Comparable {
	private char ch;
	private int count;
	
	public Alphabet(char ch) {
		super();
		this.ch = ch;
		this.count = 0;
	}

	public char getCh() {
		return ch;
	}
	
	public void count(char ch) {
		if(this.ch == ch) {
			this.count++;
		}
	}

	@Override
	public String toString() {
		return "Alphabet [ch=" + ch + ", count=" + count + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(this.count > ((Alphabet) o).count) {
			return -1;
		}
		
		if(this.count < ((Alphabet) o).count) {
			return 1;
		}
		return 0;
	}

	public int getCount() {
		return count;
	}
	
	
	
	
}

public class Problem1157 {
	
	private static List<Alphabet> chList;
	
	public static Alphabet findAlphabet(char ch) {
		for(Alphabet al : chList) {
			if(al.getCh() == ch) {
				return al;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		chList = new ArrayList<>();
		
		str = str.toUpperCase();
		
		for (int i = 0; i < 26; i++) {
			chList.add(new Alphabet((char) ('A' + i)));
		}
		
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			Alphabet al = findAlphabet(temp);
			al.count(str.charAt(i));
		}
		
		Collections.sort(chList);
		
		if(chList.get(0).getCount() == chList.get(1).getCount()) {
			System.out.println("?");
		} else {
			System.out.println(chList.get(0).getCh());
		}
	}

}
