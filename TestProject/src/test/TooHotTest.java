package com.qa.TestProject;
import static org.junit.Assert.*;
import org.junit.Test;

public class TooHotTest {
	
public boolean hotAF(int a, boolean b) {
		
		boolean isSummer = b;
		
		if (a>=60 & a<=100 & isSummer) {
			return true;
		}
		
		else if (a>=60 & a<=90 & !isSummer) {
			return true;
		}
		else if (a<60 & (isSummer | !isSummer)) {
			return false;
		}
		
		return true;
}
	@Test
	public void test() {
		TooHotTest hot = new TooHotTest();
		
		assertEquals(false,hot.hotAF(50,true));
		
	}

}
	
	

