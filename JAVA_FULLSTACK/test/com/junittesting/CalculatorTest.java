package com.junittesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Inside @BeforeClass");
	}
	Calculator c;
	
	@Before
	public void toCallBefore()
	{
		System.out.println("Inside @Before");
		c=new Calculator();
	}
	
	@Before
	public void toCallAfter()
	{
		System.out.println("Inside @After");
		
	}
	
	@Test
	public void test() {
		
		assertEquals(5,c.divide(10,2));
		
	}
	
	
	//-----------------------------
	@Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
       assertEquals(0,c.divide(3, 0));
        //assertEquals("Divide by zero gives infinity as result", false, Double.isInfinite(resultDiv));
    }
	
	
	
	
	
	//--------------------
	
	@After
	public void afterClass()
	{
		System.out.println("@AfterClass ");
	}

	@Test
	public void test2() {
		
		assertEquals(5,c.add(3,2));
		
	}
	
	@Ignore
	public void test3()
	{
		System.out.println("In @Ignore");
		assertEquals(10,c.add(20, 10));
	}
	
	@Test(timeout=1000)
	public void testTimeout()
	{
		c.toTestTimeout();
	}
	
	
	


}
