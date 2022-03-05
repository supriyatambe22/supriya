package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class Testcase {


	

	@Test
	public void test()
	{
		Add s= new Add();
		assertEquals(4,s.add(2,2));
	}

}
