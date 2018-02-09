package junit.test.merge;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class Testtransfer {
	merge merge;
	Vector<String> vec1 = new Vector<String>();
	Vector<String> vec2= new Vector<String>();
	Vector<Integer> block =new Vector<Integer>();
	
	@Before
	public void setup() {
		merge = new merge();
		vec1.add("aaa");
		vec1.add("bbb");
		vec1.add("ccc");
		vec2.add("");
		vec2.add("");
		vec2.add("ccc");
		block.add(0);
		block.add(1);
	}

	@Test
	public void testtransfer() {
		merge.transfer(vec1, vec2, block);
		assertEquals(vec2.elementAt(block.elementAt(0)).equals("aaa"),true);
		assertEquals(vec2.elementAt(block.elementAt(1)).equals("bbb"),true);
	}
}
