package com.lambaexpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class StringList
{
	String s;

	@Override
	public String toString() {
		return "" + s ;
	}

	public StringList(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}

public class RemoveOddLengthWords {
	
	public static void main(String[] args) {
		Consumer<List> consume =(List sl)->System.out.println(sl);
		
		
		 Predicate<? super StringList> predicate = (StringList list)-> {
			if(((String) list.getS()).length() % 2 != 0)return true;
			else return false;
	};

		List<StringList> listOfStrings =new ArrayList<StringList>();
		listOfStrings.add(new StringList("Hello"));
		listOfStrings.add(new StringList("Good Morning"));
		listOfStrings.add(new StringList("Alohaa"));
		listOfStrings.add(new StringList("SUNNY DAY"));
		listOfStrings.add(new StringList("rain"));
		listOfStrings.add(new StringList("BHUBANESWAR"));
		listOfStrings.add(new StringList("full stack java"));
	
			listOfStrings.removeIf(predicate);
			consume.accept(listOfStrings);
			
	}
		
		
		
		
	

}
