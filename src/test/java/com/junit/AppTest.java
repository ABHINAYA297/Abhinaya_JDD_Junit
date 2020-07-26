package com.junit;

import org.junit.Before;
import org.junit.Test;

class DeleteAInStringTest {

	StringDeletion d ;
	
	@Before
	void createObject() {
		d = new StringDeletion();
	}
	
	@Test
	void test1characters() {
		
		assertEquals("", d.deletechar("A"));
		assertEquals("B", d.deletechar("B"));
	}
	
	private void assertEquals(String string, String deletechar) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testemptycharacters() {
		
		assertEquals("", d.deletechar(""));	
	}
	
	
	@Test
	void test2characters() {
		
		assertEquals("", d.deletechar(""));
		assertEquals("", d.deletechar("AA"));
		assertEquals("B", d.deletechar("BA"));
		assertEquals("BB", d.deletechar("BB"));		
	}
	
	@Test
	void test3characters() {
		
		assertEquals("A", d.deletechar("AAA"));
		assertEquals("B", d.deletechar("AAB"));
		assertEquals("BA", d.deletechar("ABA"));
		assertEquals("BB", d.deletechar("ABB"));
		assertEquals("BA", d.deletechar("BAA"));
		assertEquals("BB", d.deletechar("BAB"));
		assertEquals("BBB", d.deletechar("BBB"));
		assertEquals("BX", d.deletechar("ABX"));
	}
	
	@Test
	void test4characters() {
		
		assertEquals("AA", d.deletechar("AAAA"));
		assertEquals("BCD", d.deletechar("ABCD"));
		assertEquals("BCD", d.deletechar("BACD"));
		assertEquals("BBAA", d.deletechar("BBAA"));
		assertEquals("BAA", d.deletechar("ABAA"));
		assertEquals("BAB", d.deletechar("ABAB"));
		assertEquals("BB", d.deletechar("AABB"));
		assertEquals("BAA", d.deletechar("BAAA"));
	}
	
	@Test
	void testNcharacters() {
		
		assertEquals("AABBBBCC", d.deletechar("AAAABBBBCC"));
		assertEquals("BBAAAAACD", d.deletechar("BBAAAAACD"));
		assertEquals("BCDBACD", d.deletechar("BACDBACD"));
		assertEquals("BBAAAXYZ", d.deletechar("BBAAAXYZ"));
	}

}