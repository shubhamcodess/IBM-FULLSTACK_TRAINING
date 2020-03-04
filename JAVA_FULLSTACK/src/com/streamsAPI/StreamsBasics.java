package com.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamsBasics {

	public static void main(String[] args) {
		
		
	List<String> myList =new ArrayList<String>();

		 myList.add("billy");
		 myList.add("Mario");
		 myList.add("shazam");
		 myList.add("barry");
		 myList.add("iris");
		 myList.add("harrison");
		 myList.add("savitar");
				//List<String> streamOperationList =
				myList.stream().filter((String s)->s.startsWith("s")).sorted().forEach(System.out::println);

	}

}
