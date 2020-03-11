package com.junittesting;

public class ComplexNumberAdd {

	 double real;
	 double imaginary;

	public ComplexNumberAdd(double real,double imaginary){
	this.real=real;
	this.imaginary=imaginary;
  }

	public ComplexNumberAdd add(ComplexNumberAdd c){
	double sreal=this.real+c.real;
	double simaginary=this.imaginary + c.imaginary;
	ComplexNumberAdd temp =new ComplexNumberAdd(sreal,simaginary);
	return temp;
 }
	



}
