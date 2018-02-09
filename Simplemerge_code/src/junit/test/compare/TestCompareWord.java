package junit.test.compare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCompareWord {
	compare compare;
	String arr1[];
	String arr2[];

	@Before
	public void setup() {
		compare = new compare();
		arr1 = new String[] { "aaa", "bbb", "ccc" };
		arr2 = new String[] { "ddd", "bbb", "ccc" };
	}

	@Test
	public void testCompareWord() {
		assertEquals(compare.compareWord(compare.lcs(arr1, arr2), arr1, arr2), "aaa");
	}
}
