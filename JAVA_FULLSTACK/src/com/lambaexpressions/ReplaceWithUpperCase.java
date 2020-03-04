package com.lambaexpressions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ReplaceWithUpperCase {
	
	//static
	public static void main(String[] args) {
		
		 List<String> newList =new ArrayList<String>();

		newList.add("billy");
		newList.add("Mario");
		newList.add("shazam");
		newList.add("barry");
		newList.add("iris");
		newList.add("harrison");
		newList.add("savitar");
		
		UnaryOperator<String> unaryOperator = (String list)->{ 
															return  list.toUpperCase() ;
															};
		newList.replaceAll(unaryOperator) ;
	    Consumer<List> consumer= (List s)-> System.out.println(s);
	    consumer.accept((List) newList);

	}

}
