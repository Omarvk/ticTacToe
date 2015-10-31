//This is a TDD class for Interface.java

package com.btfc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.btfc.tictactoe.*;

public class InterfaceTest
{ 	
	@Test
	public void testOutput()
	{
        	Interface i = new Interface();
		assertEquals("Hello World", i.menu());
	}
}
