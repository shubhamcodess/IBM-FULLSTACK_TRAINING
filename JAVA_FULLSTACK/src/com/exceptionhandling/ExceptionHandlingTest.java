package com.exceptionhandling;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		System.out.println("In Main");
		/*try {
			System.out.println("In try");
			int y=0;
			int z=6/y;
			System.out.println("exit Main");
		}
		catch(ArithmeticException e)
		{
			System.out.println("In catch");
		 e.getStackTrace();	
		}*/
		
	/*	try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		*/
		
		
		try{

	         try{
	            System.out.println("Inside inner try block");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArithmeticException e1){
	        	 System.out.println("Inner try block exception caught");
	            e1.getStackTrace();
	         }
		
		}
		catch(Exception e)
		{
			 System.out.println("this is outer catch block");
			e.getStackTrace();
			
		}
			
		
	}

	}


