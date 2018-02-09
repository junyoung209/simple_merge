package junit.test.fileio;

import org.junit.Before;
import org.junit.Test;

public class TestFileWrite {
	FileIO guiTestMethod;
	@Before
	public void setup(){
		guiTestMethod = new FileIO();
	}
	
	@Test(expected= NullPointerException.class)
	public void testFileWrite() {
		guiTestMethod.testFileWrite(null);
		
	}

}

