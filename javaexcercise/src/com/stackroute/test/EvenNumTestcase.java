package com.stackroute.test;

import static org.junit.Assert.*;

//import com.stackroute.code.Commoncode;
import com.stackroute.code.EvenNumTest;


//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.Test;



public class EvenNumTestcase {
	
//private static EvenNumTest even;
	
	
	

	@Test
	public void testIseven() {
		assertEquals("testIseven()",true,EvenNumTest.isEven(20));
		assertEquals("testIseven()",false,EvenNumTest.isEven(17));
	}

}
