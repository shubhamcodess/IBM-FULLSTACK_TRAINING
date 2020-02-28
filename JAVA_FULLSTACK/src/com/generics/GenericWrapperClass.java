package com.generics;

class GenericMyWrapper<E>{
	E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
	
}
public class GenericWrapperClass {

	public static void main(String[] args) {
		GenericMyWrapper<String> stringMyWrapper=new GenericMyWrapper<String>();
		stringMyWrapper.setE("Good Morning Bhubaneswar");
		String getString=stringMyWrapper.getE();
		System.out.println(getString);


	}

}
