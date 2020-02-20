package com.reflection;

import java.lang.reflect.*;
class StringOpr {
	public void getCapital(String name) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,InstantiationException, ClassNotFoundException, NoSuchMethodException{
		System.out.print(name.toUpperCase());
	}
}
class Middleware {
	public static Object invokeMethod(String className, String methodName, Class paramTypes[], Object paramValues[]) throws IllegalAccessException, InstantiationException,IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException 
	{
      Class c =Class.forName(className);
	  Object obj=c.newInstance();
      //methods[1].invoke(obj, "data");
      //System.out.println(methods[0].invoke(obj));
	  Method m = c.getMethod(methodName, paramTypes);
	  return m.invoke(obj,paramValues);
    
	}
}

class MiddlewareTest {
	public static void main(String args[])  throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException,InstantiationException, NoSuchMethodException  {
		 //System.out.println("Chal raha hai");
		Class paramTypes[] = new Class[1];
		paramTypes[0] = java.lang.String.class;
		
		Object paramValues[] = new Object[1];
		paramValues[0] = "iter";
		
		Middleware.invokeMethod("StringOpr", "getCapital", paramTypes, paramValues);
		
	}
}