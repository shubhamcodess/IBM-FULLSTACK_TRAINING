package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}
	private int height;
	private double weight;
	private String name;
	public Person(int height, double weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		if(this.weight < o.weight)
			return -1;
		else if(this.weight > o.weight)
			return 1;
		else {
			if(this.height < o.height)
				return -1;
			else
				return 
						1;
		}
		
	}
	
	
}
public class PersonTreeSet {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person(150,58.55,"ABC"));
		treeSet.add(new Person(201,108.65,"DEF"));
		treeSet.add(new Person(79,50.53,"GHI"));
		treeSet.add(new Person(150,95.57,"JKL"));
		treeSet.add(new Person(75,50.53,"MNO"));
		
		Iterator<Person> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Person p = itr.next();
			System.out.println(p);
		}

	}

}
