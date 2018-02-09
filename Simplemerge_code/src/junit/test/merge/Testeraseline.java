package junit.test.merge;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class Testeraseline {

	merge merge;
	Vector<String> vec1 = new Vector<String>();
	Vector<String> vec2= new Vector<String>();
	Vector<Integer> block =new Vector<Integer>();
	
	@Before
	public void setup() {
		merge = new merge();
		vec1.add("aaa");
		vec1.add("\t\r");
		vec1.add("\t\r");
		vec2.add("aaa");
		vec2.add("\t\r");
		vec2.add("\t\r");
		block.add(1);
		block.add(2);
	}

	@Test
	public void testeraseline() {
		merge.eraseline(vec1, vec2, block);
		assertEquals(vec1.size(),1);
		assertEquals(vec2.size(),1);
	}

}
