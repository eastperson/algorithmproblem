package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Position implements Comparable<Position> {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	public int compareTo(Position o) {
		if(this.getX() > o.getX()) {
			return 1;
		} else if (this.getX() == o.getX()) {
			if(this.getY()>o.getY()) {
				return 1;
			} else if (this.getY()<o.getY()) {
				return -1;
			}
		} else if (this.getX() < o.getX()) {
			return -1;
		}
		return 0;
	}	
}

public class Problem11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		List<Position> listPos = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			listPos.add(new Position(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(listPos);
		
		for(Position i : listPos) {
			System.out.println(i.getX() +" "+i.getY());
		}

	}
}
