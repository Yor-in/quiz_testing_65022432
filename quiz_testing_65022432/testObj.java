package quiz_testing_65022432;

import static org.junit.Assert.*;

import org.junit.Test;

public class testObj {
	
	public object testobj = new object();
	
	//1
	@Test
	public void tc011() {
		assertEquals(4, testobj.square(2));
	}
	
	//2
	@Test
	public void tc021() {
		assertEquals(2, testobj.countLetterA("aA"));
	}
	
	@Test
	public void tc022() {
		assertEquals(0, testobj.countLetterA("bcd"));
	}
	
	@Test
	public void tc023() {
		assertEquals(0, testobj.countLetterA(""));
	}
	
	//3
	@Test
	public void tc031() {
		assertEquals(false, testobj.checkTwoLetter("A"));
	}
	
	@Test
	public void tc032() {
		assertEquals(true, testobj.checkTwoLetter("AB"));
	}


}
