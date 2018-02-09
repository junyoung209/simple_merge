package junit.test.compare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBlankLineOffset {
	compare compare;

	@Before
	public void setup() {
		compare = new compare();
	}

	@Test
	public void testBlankLineOffset() {
		String[] arr = new String[] { "aaa", "bbbll", "ccc", "ddwd", "wwwe" };
		assertEquals(compare.blankLineOffset(arr, 3), 11);
	}
}
