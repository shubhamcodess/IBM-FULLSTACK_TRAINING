package com.lambaexpressions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
public class FirstLetterOfEachWord {
	 static List<StringList> listOfStrings =new ArrayList<StringList>();
	public static void main(String[] args) {

		
		listOfStrings.add(new StringList("billy"));
		listOfStrings.add(new StringList("Mario"));
		listOfStrings.add(new StringList("shazam"));
		listOfStrings.add(new StringList("barry"));
		listOfStrings.add(new StringList("iris"));
		listOfStrings.add(new StringList("harrison"));
		listOfStrings.add(new StringList("savitar"));
		
		Function<List,String> function = (List myList)-> {

											StringBuilder stringWithFirstLetter = new StringBuilder("");
											int sz=myList.size();
											for(int i=0;i<sz;i++)
											{
												stringWithFirstLetter.append(myList.get(i).toString().charAt(0));
											}
											return stringWithFirstLetter.toString();
	
	};
	Consumer<String> consumer= (String s)-> System.out.println(s);
	consumer.accept(function.apply(listOfStrings));
	
	}
	
}
