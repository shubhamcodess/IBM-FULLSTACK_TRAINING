package com.annotation;
class A
{
	public void foo1()
	{
		System.out.println("Old method");
	}
}
class B extends A{
	
	
	/*@Override
	public void foo1()
	{
		System.out.println("New method");
	}*/
	
	@Deprecated
	public void boo()
	{
		System.out.println("Use this method");
	}
	
}

public class AnnotationTest
{
	@SuppressWarnings({})
	public static void main(String args[])
	{
		
		B b=new B();
		b.boo();
	}
}