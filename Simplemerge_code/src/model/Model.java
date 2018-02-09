package model;


import java.util.Vector;

public class Model {
	Vector<String> data_vector1 = new Vector<String>();
	Vector<String> data_vector2 = new Vector<String>();
	Vector<String> word_vector1 = new Vector<String>();
	Vector<String> word_vector2 = new Vector<String>();
	Vector<String> index_vector1 = new Vector<String>();
	Vector<String> index_vector2 = new Vector<String>();

	Vector<Integer> line_index_list1 = new Vector<Integer>();
	Vector<Integer> line_index_list2 = new Vector<Integer>();

	// highlight vector
	Vector<Integer> line_diff_list = new Vector<Integer>();
	Vector<Integer> block_diff_list = new Vector<Integer>();
	Vector<Integer> Block = new Vector<Integer>();

	StringBuffer word_buffer = new StringBuffer();


	public Vector<String> getData_vector1() {
		return data_vector1;
	}
	public Vector<String> getData_vector2() {
		return data_vector2;
	}
	public Vector<String> getWord_vector1() {
		return word_vector1;
	}
	public Vector<String> getWord_vector2() {
		return word_vector2;
	}
	public Vector<Integer> getLine_index_list1() {
		return line_index_list1;
	}
	public StringBuffer getWord_buffer() {
		return word_buffer;
	}
	public Vector<Integer> getLine_index_list2() {
		return line_index_list2;
	}
	public Vector<Integer> getLine_diff_list() {
		return line_diff_list;
	}
	public Vector<Integer> block(int index) {
		Vector<Integer> temp = new Vector<Integer>();
		int front, rear;
		int tmp1 = -1, tmp2, tmp3;

		for (int i = 0; i < this.line_diff_list.size(); i++) {
			if (this.line_diff_list.get(i) == index)
				tmp1 = i;
		}
		if (tmp1 == -1)
			return null;
		else {
			front = tmp1;
			rear = tmp1;
			tmp2 = index;
			tmp3 = index;
		}
		for (int j = tmp1; j >= 0; j--) {
			if (this.line_diff_list.get(j) == tmp2) {
				front--;
				tmp2--;
			}
		}
		for (int j = tmp1; j < this.line_diff_list.size(); j++) {
			if (this.line_diff_list.get(j) == tmp3) {
				rear++;
				tmp3++;
			}
		}
		front += 1;
		rear -= 1;
		System.out.println();
		for (int i = front; i <= rear; i++)
			temp.add(this.line_diff_list.get(i));
		return temp;

	}
	public Vector<Integer> getBlock() {
		return Block;
	}
	public void setBlock(Vector<Integer> input){
		Block = input;
	}
}
