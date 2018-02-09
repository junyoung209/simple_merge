package junit.test.compare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
	
	public class TestLineToWord {
		compare compare;
		
		@Before
		public void setup(){
			compare = new compare();
		}
		 @Test
		 public void testLinetoWord() {
			 String arr = new String("abc de f");
			 assertEquals(compare.linetoWord(arr),5);
		 }
	}
