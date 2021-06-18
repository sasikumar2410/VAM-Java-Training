package jpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void testAddition() 
	{
		Cal c=new Cal();
		assertEquals(100,c.addition(90,10));
	}
@Test
	public void testMultiple() {
		
		Cal c=new Cal();
		assertEquals(90,c.multiple(9,10));
	}

}
