package com.interfacee;

interface Sortable{
	boolean compare(Sortable x);
	public double getRadius();
	public void setRadius(double radius);
	
}

abstract class Employee3 implements Sortable{
	private String name;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
	/*public boolean compare(Sortable x)
	{
		if(this.getName().charAt(0) < x.getName().charAt(0))
			return true;
		
		else 
			return false;
		
		
	}*/
}

class Circle1 implements Sortable{
	private double radius;
	public double getRadius()
	{
		return this.radius;
	}
	/*public Circle(double r)
	{
		this.radius=r;
	}*/
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public boolean compare(Sortable x)
	{
		if(this.getRadius() < x.getRadius())
			return true;
		
		else 
			return false;
		
		
	}
	
}

public class SortableTest
 {
	 public static void sortAll(Sortable s[])
	 {
		/* for(int i=0;i<s.length;i++)
		 {
	      s[i]. ();
		 }*/
        int n = s.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (s[i].compare(s[j]))
                {
                    Sortable temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
	 for(int i=0;i<s.length;i++)
		 {
			 System.out.println(s[i].getRadius());
		 }
				
				}
    
		 
	 public static void main(String args[])
	 {
		 
		 Sortable em[]=new Sortable[2];
		  Sortable cir[]=new Sortable[2];
		 cir[0]=new Circle1();
		 cir[0].setRadius(49);
		 cir[1]=new Circle1();
		 cir[1].setRadius(25);
		 
		 /*em[0]=new Employee();
		 em[0].setName("Harley");
		 em[1]=new Employee();
		 em[1].setName("Batman");
		 */
		 System.out.println("Before Sorted : ");
		 for(int i=0;i<cir.length;i++)
		 {
			 System.out.println(cir[i].getRadius());
		 }
		  SortableTest.sortAll(cir);
		 
				 System.out.println("After Sorted : ");
		 for(int i=0;i<cir.length;i++)
		 {
			 System.out.println(cir[i].getRadius());
		 }
		  
		 /*
		 
		 System.out.println("Before Sorted : ");
		 for(int i=0;i<em.length;i++)
		 {
			 System.out.println(em[i].getName());
		 }
		// Sortable t[]=new Sortable[2];
		 SortableTest.sortAll(em);
		 /*System.out.println("After Sorted : ");
		 for(int i=0;i<cir.length;i++)
		 {
			 System.out.println(t[i].getRadius());
		 }
	 
	 
				 System.out.println("After Sorted : ");
		 for(int i=0;i<s.length;i++)
		 {
			 System.out.println(s[i].getName());
		 }*/
			 
		 
	 }
 }