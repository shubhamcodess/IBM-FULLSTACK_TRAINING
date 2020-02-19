package com.annotation;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.Class;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

 @interface Getter {
	
	 public String value();
   }

class Fun{
	private int age;
	
	public Fun(int age)
	{
		this.age=age;
	}
	
	@Getter(value="CaptainAmerica")
	public int getAge()
	{
		return this.age;
		
	}
	
	@Getter(value="CaptainAmerica")
	public void deploy()
	{
		System.out.println("This is not a Getter method !!");
	}
}

public  class AnnotationTest2
{
	public static void main(String args[]) throws Exception, ClassNotFoundException
	{
		Class c=Class.forName("com.annotation.Fun");
		Method m[]=c.getDeclaredMethods();
		
		for(int i=0;i<m.length;i++)
		{
			
			Method myMethod = m[i];
			Annotation annotations[]=myMethod.getAnnotations();
			for(int j=0;j<annotations.length;j++)
			{
				String str=annotations[j].annotationType().getName();
				if(str.equals("Getter") )
				{ 
					String temp=m[i].getName();
					String temp2=temp.substring(3);
					temp2=temp2.toLowerCase();
					//System.out.println(temp2);
					Field fields[] = c.getDeclaredFields();
				
					for(int k=0;k<fields.length;k++)
					{
						if( (fields[k].getName()).equals(temp2) )
							System.out.println("@Getter Annotation is Properly used in "+ m[i].getName() + "() Method");
						
						else
							System.out.println("@Getter Annotation is Not Properly used in "+ m[i].getName() + "() Method" );
					}
				}
			}
		}
	}
}
					



	