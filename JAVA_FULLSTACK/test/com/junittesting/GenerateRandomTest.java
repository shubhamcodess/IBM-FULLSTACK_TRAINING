package com.junittesting;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GenerateRandomTest {

		public static GenerateRandom g;
		public GenerateRandomTest() {
			
		}
		@Parameterized.Parameters
		public static Collection getRandomCollection() {
			System.out.println("Inside getRandomCollection");
			return Arrays.asList(new Object[][] {
				{},{},{},{},{},{},{},{}
				});
	
		}
			
		
		@Before
		public void initialize() {
			g = new GenerateRandom();
			System.out.println("Inside initialize()");
		}
		
		
		@Test
		public void testIsUnder100() {
			System.out.println("\tInside testIsPrime()");
			int x=g.getRandom();
			System.out.println("\tRandom Number : "+x);
			assertTrue(x<100);
		}

	


}
