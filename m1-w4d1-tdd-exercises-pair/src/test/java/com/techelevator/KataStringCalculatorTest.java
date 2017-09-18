package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {

	KataStringCalculator sut;
	
	@Before
	 public void setUp () {
		sut = new KataStringCalculator();
	}
	
	@Test
	public void testIntAddSimple() {
		int result = sut.add("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testIntNull() {
		int result = sut.add(null);
		assertEquals(0, result);
	}
	
	@Test
	public void testIntAddToEight() {
		int result = sut.add("1,2,5");
		assertEquals(8, result);
	}
	
	@Test
	public void testIntEmpty() {
		int result = sut.add("");
		assertEquals(0, result);
	}
	
	@Test
	public void testIntAddToSix() {
		int result = sut.add("1\n2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void testIntDiffDelims() {
		int result = sut.add("1;2 , 7\n10,3");
		assertEquals(23, result);
	}
	
	@Test
	public void testIntThree() {
		int result = sut.add("//;\n1;2");
		assertEquals(3, result);
	}
	
	@Test
	public void testIntThirteen() {
		int result = sut.add("//!\n4!9");
		assertEquals(13, result);
	}
}
