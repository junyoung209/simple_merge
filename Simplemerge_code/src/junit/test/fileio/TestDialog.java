package junit.test.fileio;

import static org.junit.Assert.assertEquals;

import javax.swing.JFileChooser;

import org.junit.Before;
import org.junit.Test;
	
	public class TestDialog {
		FileIO guiTestMethod;
		
		@Before
		public void setup(){
			guiTestMethod = new FileIO();
		}
		
//		@Test
//		public void testOpenDialog() {
//			assertEquals(guiTestMethod.openDialog(),JFileChooser.APPROVE_OPTION);
//		}
		
		@Test
		public void testCloseDialog() {
			assertEquals(guiTestMethod.openDialog(),JFileChooser.CANCEL_OPTION);
		}
	
	
	
}
