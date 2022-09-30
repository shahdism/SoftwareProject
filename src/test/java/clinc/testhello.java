package clinc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import clinc.util.hellio;

public class testhello {
	
	hellio obj;
	
	@Test
	public void testAdd()
	{
		obj=new hellio();
		int expected=9;
		int actual =obj.add(4, 5);	
		//testing
		
		assertTrue(expected ==  actual);
		
	}

}
