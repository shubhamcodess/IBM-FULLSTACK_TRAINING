package com.exceptionhandling;


 interface AutoCloseable 
{
	public void close() throws Exception;
}
 class MyAutoCloseable implements AutoCloseable 
{

	@Override
	public void close() throws Exception
	{
		System.out.println("MyAutoCloseable closed!");
	}
}




public class AutoCloseableInterface {

	public static void main(String[] args) {
		 try(MyAutoCloseable m=new MyAutoCloseable("abc.txt"))
		 {
			 System.out.println("Inside try");
		 }
		 catch(MyAutoCloseable e)
		 {
			 e.getStackTrace();
		 }
		 }

	}

}
