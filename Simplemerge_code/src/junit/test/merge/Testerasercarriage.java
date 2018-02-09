package junit.test.merge;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class Testerasercarriage {

	merge merge;
	Vector<String> vec1 = new Vector<String>();
	Vector<String> vec2= new Vector<String>();
	Vector<Integer> block =new Vector<Integer>();
	
	@Before
	public void setup() {
		merge = new merge();
		vec1.add("aaa\r\r");
		vec1.add("bb\r\r");
		vec1.add("c\r");
		vec2.add("aaa\r\r");
		vec2.add("bb\r\r");
		vec2.add("c\r");
		block.add(0);
		block.add(1);
	}

	@Test
	public void testerasercarriage() {
		merge.erasecarriage(vec1, vec2, block);
		assertEquals(vec1.get(0).equals("aaa\r"),true);
		assertEquals(vec1.get(1).equals("bb\r"),true);
		assertEquals(vec2.get(0).equals("aaa\r"),true);
		assertEquals(vec2.get(1).equals("bb\r"),true);
	}
}
