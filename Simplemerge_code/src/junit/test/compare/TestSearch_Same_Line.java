package junit.test.compare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSearch_Same_Line {

	compare compare;
	String[] arr1;
	String[] arr2;

	@Before
	public void setup() {
		compare = new compare();
		arr1 = new String[] { "aaa", "bbb", "ccc" };
		arr2 = new String[] { "ccc", "ddd", "eee" };
	}

	@Test
	public void testSearch_same_line() {
		assertEquals(compare.search_same_line(arr1, arr2), 2);
	}
}
