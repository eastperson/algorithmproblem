package bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Board{
	
	private List<Row> rowList;
	int sum;
	
	public Board() {
		this.rowList = new ArrayList<>();
	}

	public List<Row> getRowList() {
		return rowList;
	}

	public void setRowList(List<Row> rowList) {
		this.rowList = rowList;
	}
	
	
	
}


class Row {
	
	private boolean isBlack;
	private int count1;
	private int count2;
	private List<Boolean> list;
	
	public Row(String line) {
		this.list = new ArrayList<>();
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == 'B' || line.charAt(i) == 'b') {
				boolean isBlack = true;
				this.list.add(isBlack);
			} else {
				boolean isBlack = false;
				this.list.add(isBlack);
			};
		}
	}
	
	public void makeChessRow1(List<Boolean> list) {
		for(int i = 0; i < list.size(); i = i + 2) {
			if(list.get(i) == true) {
				if(i+1>list.size()-1){
					continue;
				}
				if(list.get(i+1) == true) {
					this.count1++;
					list.set(i+1, false);
				}
				continue;
			} else if(list.get(i) == false) {
				this.count1++;
				list.set(i, true);
				if(i+1>list.size()-1){
					continue;
				}
					if(list.get(i+1) == true) {
						this.count1++;
						list.set(i+1, false);
					}
			}
		}
	}
	
	public void makeChessRow2(List<Boolean> list) {
		for(int i = 0; i < list.size(); i = i + 2) {
			if(list.get(i) == false) {
				if(i+1>list.size()-1){
					continue;
				}
				if(list.get(i+1) == false) {
					this.count2++;
					list.set(i+1, true);
				}
				continue;
			} else if(list.get(i) == true) {
				this.count2++;
				list.set(i, false);
				if(i+1>list.size()-1){
					continue;
				}
					if(list.get(i+1) == false) {
						this.count2++;
						list.set(i+1, true);
					}
			}
		}
	}

	public int getCount1() {
		return count1;
	}

	public void setCount1(int count1) {
		this.count1 = count1;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}

	public List<Boolean> getList() {
		return list;
	}

	public void setList(List<Boolean> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Row [isBlack=" + isBlack + ", count1=" + count1 + ", count2=" + count2 + ", list=" + list + "]";
	}
	
	
}


public class Problem1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int collumn = sc.nextInt();
		Board board1 = new Board();
		Board board2 = new Board();
		sc.nextLine();
		
		for(int i = 0; i < row; i++) {
			String str = sc.nextLine();
			board1.getRowList().add(new Row(str));
			board2.getRowList().add(new Row(str));
		}
		
		
		for(int i = 0; i < board1.getRowList().size(); i = i + 2) {
			board1.getRowList().get(i).makeChessRow2(board1.getRowList().get(i).getList());
			board1.getRowList().get(i+1).makeChessRow1(board1.getRowList().get(i+1).getList());
			board1.sum += board1.getRowList().get(i).getCount2();
			board1.sum += board1.getRowList().get(i+1).getCount1();
		}
		
		for(int i = 0; i < board2.getRowList().size(); i = i + 2) {
			board2.getRowList().get(i).makeChessRow1(board2.getRowList().get(i).getList());
			board2.getRowList().get(i+1).makeChessRow2(board2.getRowList().get(i+1).getList());
			board2.sum += board2.getRowList().get(i).getCount1();
			board2.sum += board2.getRowList().get(i+1).getCount2();
		}
		
		int result = board1.sum < board2.sum ? board1.sum : board2.sum;
		
		System.out.println(result);

	}
}


/*
class Board {
	Scanner sc = new Scanner(System.in);
	
	int width;
	int height;
	int[][] arr;
	
	public Board(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Board [width=" + width + ", height=" + height + ", arr=" + Arrays.toString(arr) + "]";
	}
	
	public void generateBoard(Scanner sc) {
		this.arr = new int[this.width][this.height];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int n = 0;
				if(sc.next().equalsIgnoreCase("B")) {
					n = 1;
				} else if (sc.next().equalsIgnoreCase("W")) {
					n = 0;
				}
				arr[i][j] = n;
			}
		}
	}
	
	
}

Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		Board b = new Board(m, n);
	
			b.arr = new int[m][n];
			for(int i = 0; i < b.arr.length; i++) {
				for(int j = 0; j < b.arr[i].length; j++) {
					int k = 0;
					if(sc.nextLine().charAt(j) == 'W') {
						k = 1;
					} else if (sc.nextLine().charAt(j) == 'B') {
						k = 0;
					}
					b.arr[i][j] = k;
				}
			}
			
			System.out.println(Arrays.deepToString(b.arr));
		}
		
//		b.generateBoard(sc);

 */

