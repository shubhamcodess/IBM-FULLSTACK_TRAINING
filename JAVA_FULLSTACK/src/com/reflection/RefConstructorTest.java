package com.reflection;

class Aa{
}


class RefConstructorTest
{
	public static void main(String args[])
	{
		Class c=Class.forName(args[0]);
		Constructor con[]=c.getDeclaredConstructor();
		if(con.length==0)
			c.newInstance();
		
		boolean hasDC=false;
		
		for(int i=0;i<con.length();i++)
		{
			Constructor constructor = xxx;
			Class paramTypes[]=constructor.getParameterTypes();
			if(paramTypes.length==0)
				hasDC=true;
		}
		
		if(hasDC==true)
		{
			//call new instance
			c.newInstance();
		}
		
		else{
			//call instance for parameterized cpnstructor con[0]
	}