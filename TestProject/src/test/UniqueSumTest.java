package com.qa.TestProject;
import static org.junit.Assert.*;
import org.junit.Test;

public class UniqueSumTest {

	
	public int uniqueSumTest(int a, int b, int c) {
		
		int d = 0;
		
		if (a!=b & a!=c & b!=c) {
			d = a + b + c;
		}
		else if (a==b & b==c) {
			return d;
		}
		else if  (a==b) {
			return c;
		}
		else if (a==c) {
			return b;
		}
		else if (b==c) {
			return a;
		}
		
		
		return d;
	}
	
	@Test
	public void test() {
		UniqueSumTest u = new UniqueSumTest();
		
		assertEquals(6,u.uniqueSumTest(1, 2, 3));
		assertEquals(3,u.uniqueSumTest(1, 1, 3));
		assertEquals(2,u.uniqueSumTest(3, 2, 3));
		assertEquals(1,u.uniqueSumTest(1, 2, 2));
		assertEquals(0,u.uniqueSumTest(1, 1, 1));
	}
	
	
	
}
