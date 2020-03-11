package com.junittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, ComplexNumberAddTest.class, GenerateRandomTest.class })
public class AllTests {

}
