package com.qa.TestProject;
import static org.junit.Assert.*;
import org.junit.Test;



public class BlackJackTest {
	
	public int blackjack(int a, int b) {
		int c = 0;
			
		if (a>=b & a<=21 & a>0) {
			return a;
		}
		else if (b>a & b<=21 & b>0) {
			return b;
		}
		else if (a>21 & b<=21 & b >0) {
			return b;
		}
		else if (b>21 & a<=21 & a>0) {
			return a;
		}
		
		return c;
	}
	
	
	@Test
	public void test() {
		BlackJackTest b = new BlackJackTest();
		
		assertEquals(18,b.blackjack(18,15));
		assertEquals(20,b.blackjack(20,22));
		assertEquals(21,b.blackjack(30,21));
		assertEquals(0,b.blackjack(24,25));
	}
	
	

}
