package Junittestcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Junit.Division;


public class Testsample
{
	@Test
	public void test()
	{
		
	Division d=new Division();
	assertEquals(2,d.div(10,5));

	}
}

