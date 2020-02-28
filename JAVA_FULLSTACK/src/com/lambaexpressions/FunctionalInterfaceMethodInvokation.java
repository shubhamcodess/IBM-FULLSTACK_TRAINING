package com.lambaexpressions;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMethodInvokation {

	public static void main(String[] args) {
		
		Consumer<Integer> consume = (Integer x)-> System.out.println("Here is a Random number : "+x);
		Consumer<Boolean> consumeB = (Boolean x)-> {
			if(x==true) System.out.println("The Number is greater than 20");
			else System.out.println("The Number is less than 20");
		};
		Consumer<Double> consumeD =(Double d)-> System.out.println("Power : "+d);
		
		Supplier supply = ()->{
			  					Random rand = new Random();
			  					return rand.nextInt(50);
								};
		Function<Integer,Double> function = (a)-> {
														System.out.println("Here is a Random number : "+a);
														 return Math.pow(a, 2);
																	};
       Predicate<Integer> predicate = (Integer i)-> {
    	   										if(i>20) 
    	   											return true; 
    	   										else
    	   											return false;};
		consume.accept((int) supply.get());
		consumeB.accept(predicate.test((int) supply.get())) ;
		consumeD.accept(function.apply((int)supply.get()));
	}

}
