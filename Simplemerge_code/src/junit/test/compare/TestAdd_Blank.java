package junit.test.compare;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class TestAdd_Blank {
	compare compare;
	Vector vec1 = new Vector();
	Vector vec2 = new Vector();

	@Before
	public void setup() {
		compare = new compare();
		vec1.add("aaa");
		vec1.add("bbb");
		vec1.add("ccc");
		vec2.add("ccc");
		vec2.add("ddd");
		vec2.add("eee");
	}

	@Test
	public void testAdd_blank() {
		compare.add_blank(vec1, vec2, 0, 2);
		assertSame(vec1.elementAt(2), vec2.elementAt(2));
	}
}
