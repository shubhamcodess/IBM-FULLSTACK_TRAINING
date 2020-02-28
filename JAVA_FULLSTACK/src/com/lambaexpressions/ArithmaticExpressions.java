package com.lambaexpressions;


@FunctionalInterface
 interface Operate{
	int operateOnIt(int a, int b);
	
}
public class ArithmaticExpressions {

	public static void main(String[] args) {
		Operate opr = (a,b)->a+b;
		System.out.println("Addition : "+opr.operateOnIt(3,6));
		Operate opr2 = (a,b)->a-b;
		System.out.println("Subtraction : "+opr2.operateOnIt(9,6));
		Operate opr3 = (a,b)->a*b;
		System.out.println("Multiplication : "+opr3.operateOnIt(31,6));
		Operate opr4 = (a,b)->a/b;
		System.out.println("Division : "+opr4.operateOnIt(66,6));

	}

}
