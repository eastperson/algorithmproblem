package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Position2 implements Comparable<Position2> {
	private int x;
	private int y;
	public Position2(int x, int y)  {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return x+" "+y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int compareTo(Position2 o) {
		if(this.y > o.y) {
			return 1;
		} else if (this.y == o.y) {
			if(this.x > o.x) {
				return 1;
			} else if(this.x < o.x) {
				return -1;
			}
		} else if (this.y < o.y) {
			return -1;
		}
		
		
		return 0;
	}
	
	
	
}

public class Problem11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Position2> list = new ArrayList<>();
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			list.add(new Position2(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(list);
		
		for(Position2 p : list) {
			System.out.println(p.getX() +" "+p.getY());
		}
	}
}
