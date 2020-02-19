package com.interfacee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>
{
	 int height_in_inches;
	 double weight;
	 String name;
	 
	public Person(String name,int height,double weight)
	{
		this.name=name;
		this.height_in_inches=height;
		this.weight=weight;
	}
	public String toString()
	{
		return this.name+"-"+this.height_in_inches+"inches-"+this.weight+"kg";
	}
	
	
	public int compareTo(Person p) {
		if(this.weight > p.weight) {
			return -1;
		}
		else if(this.weight < p.weight) {
			return 1;
		}
		return 0;
	}
}

	class NameComparator implements Comparator<Person>{
		public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name)*-1;
	}
	}
	
	class HeightComparator implements Comparator<Person>{
		public int compare(Person p1, Person p2) {
		if(p1.height_in_inches > p2.height_in_inches) {
			return -1;
		}
		else if(p1.height_in_inches < p2.height_in_inches) {
			return 1;
		}
		return 0;
	}
	}
	
	class WeightComparator implements Comparator<Person>{
		public int compare(Person p1, Person p2) {
		if(p1.weight > p2.weight) {
			return -1;
		}
		else if(p1.weight < p2.weight) {
			return 1;
		}
		return 0;
	}
	}
	
	public class PersonTest
	{
		public static void main(String args[])
		{
		Person person1 = new Person("Ramanujan",15,75);
		Person person2 = new Person("Arjun",13,86);
		Person person3 = new Person("Krishna",20,65);

		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		
		Collections.sort(list, new NameComparator()); 

		for(Person person: list) {
		System.out.println(person);}
			
			Collections.sort(list, new HeightComparator()); 

		for(Person person: list) {
		System.out.println(person);}
			
			Collections.sort(list, new WeightComparator()); 

		for(Person person: list) {
		System.out.println(person);}
		
		Collections.sort(list);

		for(Person person: list) {
		System.out.println(person);}
		}
		
		
	}
	
	
		