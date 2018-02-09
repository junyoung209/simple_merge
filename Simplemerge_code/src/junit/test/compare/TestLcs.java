package junit.test.compare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLcs {

	compare compare;
	String[] arr1;
	String[] arr2;
	int[][] test;

	@Before
	public void setup() {
		compare = new compare();
		arr1 = new String[] { "aaa", "bbb", "ccc" };
		arr2 = new String[] { "ccc", "ddd", "eee" };
	}

	@Test
	public void testLcs() {
		test = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 1, 1 } };
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				assertEquals(test[i][j], compare.lcs(arr1, arr2)[i][j]);
			}
	}
}
