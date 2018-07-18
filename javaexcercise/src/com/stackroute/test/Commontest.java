package com.stackroute.test;


import static org.junit.Assert.*;
import com.stackroute.code.Commoncode;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Commontest {
	private static Commoncode code;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		code= new Commoncode();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
	code = null;

	}

	@Test
    public void testGetReverse() {
         assertEquals("testGetReverse(),reversing the string",1,code.getReverse(1234321));
       //  assertEquals("testGetReverse(),reversing the string",1,code.getReverse(1234321));
        
    }


    @Test
    public void testGetReverseFailure() {
        assertNotEquals("testGetReverse(),failurecase",0,code.getReverse(0));
    }
    
    @Test
    public void testGetPower() {
         assertEquals("testGetPower(),power of 4 ",1,code.getPower(16));
        
    }

    @Test
    public void testGetAvg() {
        //String[] expect = { "81.5", "65", "98" };
        int [] array = { 86, 65, 98, 77 };
        float actual = code.getAvg(array);
        float ex=(float) 81.5;
        assertEquals(ex, actual,0.001);

    }
 
 
 
 
 @Test
 public void testGetMax()
 {
     int[] arr= {86,65,98,77};
     assertEquals(98,code.getMax(arr));
 }
 @Test
 public void testGetMin()
 {
     int[] arr= {86,65,98,77};
     assertEquals(65,code.getMin(arr));
 }
    
 @Test
 public void testIntFact() {
     //int val=Integer.MAX_VALUE;

     assertEquals(479001600 ,code.printIntFactorials(1,1));
 }
 @Test
 public void testLongFact() {
     //int val=Integer.MAX_VALUE;
     long a=1L;
     long b=1L;
     long c=2432902008176640000L;
     

     assertEquals(c,code.printLongFactorials(a,b));
 }
    
    
}