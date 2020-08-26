package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class House {
	
	int num;
	Color color;
	
	House(){
		
	}
	House(int num, String color){
		this.num = num;
		this.color = new Color(color);
	}
}

class Color {
	String color;
	int cost;
	Color(String color){
		this.color = color;
	}
	
	Color(String color, int redCost, int greenCost, int blueCost){
		this.color = color;
		if(this.color.equals("red")) {
			this.cost = redCost;
		}
		if(this.color.equals("green")) {
			this.cost = greenCost;
		}
		if(this.color.equals("blue")) {
			this.cost = blueCost;
		}
	}
}


public class Problem1149 {
	public static void main(String[] args) {
		List<House> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int redCost = sc.nextInt();
			int greenCost = sc.nextInt();
			int blueCost = sc.nextInt();
			
			
			
			
		}
		
		if(list.size()>2) {
			list.add(new House());
		}
		
	}

}
