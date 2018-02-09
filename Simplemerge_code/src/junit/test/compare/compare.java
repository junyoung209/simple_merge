package junit.test.compare;

import java.util.Vector;

import javax.swing.text.BadLocationException;

import controller.Controller.highlight;

public class compare {

	public compare() {
	}

	public int[][] lcs(String[] arr1, String[] arr2) {
		int[][] table = new int[arr1.length + 1][arr2.length + 1];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j]))
					table[i + 1][j + 1] = table[i][j] + 1;
				else
					table[i + 1][j + 1] = table[i + 1][j] > table[i][j + 1] ? table[i + 1][j] : table[i][j + 1];
			}
		}
		return table;
	}

	public int search_same_line(String[] arr1, String[] arr2) {
		int result = 0;
		int[][] LCSLineTbl = new int[arr1.length + 1][arr2.length + 1];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j]))
					LCSLineTbl[i + 1][j + 1] = LCSLineTbl[i][j] + 1;
				else
					LCSLineTbl[i + 1][j + 1] = LCSLineTbl[i + 1][j] > LCSLineTbl[i][j + 1] ? LCSLineTbl[i + 1][j]
							: LCSLineTbl[i][j + 1];
			}
		}

		for (int x = arr1.length, y = arr2.length; x != 0 && y != 0;) {
			if (LCSLineTbl[x][y] == LCSLineTbl[x - 1][y])
				x--;
			else if (LCSLineTbl[x][y] == LCSLineTbl[x][y - 1])
				y--;
			else {
				char ch1[] = arr1[x - 1].toCharArray();
				char ch2[] = arr1[x - 1].toCharArray();
				if ((ch1[0] > 31 || ch1[0] == 9) && (ch2[0] > 31 || ch1[0] == 9))
					result = x - 1;
				x--;
				y--;
			}
		}
		return result;
	}

	public int blankLineOffset(String[] line, int x) {
		if (x == 0)
			return 0;
		else {
			int result = 0;
			for (int i = 0; i < x; i++)
				result += line[i].length();
			return result;
		}
	}

	public void add_blank(Vector vec1, Vector vec2, int blank_add_pos, int repeat) {
		
		for(int i=0; i<repeat; i++){
			vec2.add(blank_add_pos, "\n");
		}
		
	}
	public String compareWord(int[][] table, String[] arr1, String[] arr2) {
		for (int x = arr1.length, y = arr2.length; x != 0 || y != 0;) {
			if (x != 0 && y != 0) {
				if (table[x][y] == table[x - 1][y]) {
					
					return arr1[x-1];
					
				} else if (table[x][y] == table[x][y - 1]) {
					
					return arr2[y-1];
					
				} else {
					x--;
					y--;
				}
			} else if (x == 0) {
				return arr2[y-1];
				
			} else if (y == 0) {
				return arr1[x-1];
				
			}
		}
		return "null";
	}
	
	public int linetoWord(String line) {
		
		int result = 0;		
		StringBuffer word_buffer = new StringBuffer();
		
		for (int i = 0; i < line.length(); i++) {
			if (i != 0) {
				if ((line.charAt(i) == ' ' || line.charAt(i) == '\r') && line.charAt(i - 1) != ' ') {
					result++;
					word_buffer.delete(0, word_buffer.length());
				}
			}
			word_buffer.append(line.charAt(i));
			if (line.charAt(i) == ' ' || i == line.length() - 1) {
				result++;
				word_buffer.delete(0, word_buffer.length());
			}
		}
		
		return result;
		
	}

	
}
