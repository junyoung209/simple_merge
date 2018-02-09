package junit.test.fileio;

import org.junit.Before;
import org.junit.Test;

public class TestFileRead {
	FileIO guiTestMethod;
	@Before
	public void setup(){
		guiTestMethod = new FileIO();
	}
	
	@Test(expected=NullPointerException.class)
	public void testFileRead() {
		guiTestMethod.testFileRead("13123");
	}
	@Test(expected=NullPointerException.class)
	public void testReadNull() {
		guiTestMethod.testFileRead(null);
	}
	

}
