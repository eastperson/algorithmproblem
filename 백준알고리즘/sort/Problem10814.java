package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class User implements Comparable<User> {
	private String name;
	private int age;
	private int order;
	
	
	public User(int age, String name, int order) {
		super();
		this.name = name;
		this.age = age;
		this.order = order;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + "]";
	}
	
	
	
	@Override
	public int compareTo(User o) {
		if(this.age > o.age) {
			return 1;
		} else if (this.age == o.age) {
			if(this.order > o.order) {
				return 1;
			} else if (this.order < o.order) {
				return -1;
			}
		} else if (this.age < o.age){
			return -1;
		}
		return 0;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	

	
	
}

public class Problem10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<User> list = new ArrayList<>();
		
		for(int i = 0; i < t; i++) {
			list.add(new User(Integer.parseInt(sc.next()), sc.next(), i));
		}
		
		Collections.sort(list);
		
		for(User u : list) {
			System.out.println(u.getAge() +" "+u.getName());
		}
		

	}

}
