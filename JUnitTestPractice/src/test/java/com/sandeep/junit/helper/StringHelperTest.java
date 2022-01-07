package com.sandeep.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	//Class level Instance
	StringHelper helper = new StringHelper();
	
	//AACD=> CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
	@Test
	public void testTuncateAInFirst2Positions_whenAInFirstPositionOnly() {
		String actual=helper.truncateAInFirst2Positions("ABC");
		String expected="BC";
			assertEquals(expected, actual);
	}

	@Test
	public void testTuncateAInFirst2Positions_whenANotPresentInAnyPositions() {
	
	String actual=helper.truncateAInFirst2Positions("CDEF");
	String expected="CDEF";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTuncateAInFirst2Positions_whenAPresentInAfterTwoPositions() {
	
	String actual=helper.truncateAInFirst2Positions("CDAA");
	String expected="CDAA";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTuncateAInFirst2Positions_whenAInFirstwoPositions() {
	
	String actual=helper.truncateAInFirst2Positions("AABC");
	String expected="BC";
		assertEquals(expected, actual);
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame() {
		boolean actual =helper.areFirstAndLastTwoCharactersTheSame("ABCD");
		assertFalse(actual);
	}
	
	@Test
	public void testPositiveareFirstAndLastTwoCharactersTheSame() {
		boolean actual =helper.areFirstAndLastTwoCharactersTheSame("ABAB");
		assertTrue(actual);
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_lengthLessThanTwo() {
		boolean actual =helper.areFirstAndLastTwoCharactersTheSame("A");
		assertFalse(actual);
	}
	
	@Test
	public void testPositiveareFirstAndLastTwoCharactersTheSame_LengthEqualsToTwo() {
		boolean actual =helper.areFirstAndLastTwoCharactersTheSame("AB");
		assertTrue(actual);
	}
}
