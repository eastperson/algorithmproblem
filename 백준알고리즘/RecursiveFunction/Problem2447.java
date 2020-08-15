package RecursiveFunction;

public class Problem2447 {
	
	public static void rec(String input) {
		System.out.print(output(input));
	}
	
	public static String output(String input) {
		String first = input + input + input;
		String second = input + space(input) + input;
		String third = first;
		return first + "\n" + second + "\n" + third;
	}
	
	public static String space(String input) {
		String tmp = "";
		for(int i = 0; i < input.length(); i++)
			tmp += " ";
		String space = input.replace(input, tmp);
		return space;
	}
	
	
	public static void main(String[] args) {
		System.out.println(output(output("*")));
	
	}

}
