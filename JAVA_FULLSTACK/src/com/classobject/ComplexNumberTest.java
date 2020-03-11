package com.classobject;

class ComplexNumber{
	 double real;
	 double imaginary;

	public ComplexNumber(double real,double imaginary){
	this.real=real;
	this.imaginary=imaginary;
   }

	public ComplexNumber add(ComplexNumber c,ComplexNumber c2){
	double sreal=c2.real+c.real;
	double simaginary=c2.imaginary + c.imaginary;
	ComplexNumber temp =new ComplexNumber(sreal,simaginary);
	return temp;
  }
  
  public ComplexNumber sub(ComplexNumber c){
	double sreal=this.real-c.real;
	double simaginary=this.imaginary - c.imaginary;
	ComplexNumber temp2 =new ComplexNumber(sreal,simaginary);
	return temp2;	
  }
 
	public ComplexNumber mun(ComplexNumber c){
	double sreal=this.real*c.real;
	double simaginary=this.imaginary * c.imaginary;
	ComplexNumber temp3 =new ComplexNumber(sreal,simaginary);
	return temp3;
  }
	

 public double getReal()
 {
	 return real;
	 
}

public double getImg()
{
	return imaginary;
}

public String toString()
{
	return this.getReal()+"+"+this.getImg()+"i";
}

public void swap(ComplexNumber c[])
{
	ComplexNumber t;
	t=c[0];
	c[0]=c[1];
	c[1]=t;
}
}
public class ComplexNumberTest{
	public static void main(String args[]){
		ComplexNumber c[]=new ComplexNumber[2];
		c[0]=new ComplexNumber(5,4);
		c[1]=new ComplexNumber(7,3);
		
		System.out.println("Before Swapping : ");
		System.out.println(c[0].getReal()+"+"+c[0].getImg()+"i");
		System.out.println(c[1].getReal()+"+"+c[1].getImg()+"i");
		c[0].swap(c);
		
		System.out.println("After Swapping : ");
		System.out.println(c[0].getReal()+"+"+c[0].getImg()+"i");
		System.out.println(c[1].getReal()+"+"+c[1].getImg()+"i");
		/*ComplexNumber temp=c1.add(c2);
		ComplexNumber temp2=c1.sub(c2);
		ComplexNumber temp3=c1.mun(c2);

		System.out.println("ADDITION RESULT ->  "+temp);
		System.out.println("SUBTRACTION RESULT ->  "+temp2);
		System.out.println("MULTIPLICATION RESULT ->  "+temp3);*/
}
}