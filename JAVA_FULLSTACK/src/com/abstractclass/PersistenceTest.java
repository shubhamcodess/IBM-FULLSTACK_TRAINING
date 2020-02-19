package com.abstractclass;

abstract class Persistence{
	abstract void persist();
}
class FilePersistence extends Persistence{
	void persist()
	{
		System.out.println("Data persisted into the File !");
	}
}

class DatabasePersistence extends Persistence{
	void persist()
	{
		System.out.println("Data persisted into the File !");
	}
}

class PersistanceFactory
{
	static Persistence getPersistence()
	{
		FilePersistence p=new FilePersistence();
		return p;
	}
}

public class PersistenceTest
{
	public static void main(String args[])
	{
		Persistence p = PersistanceFactory.getPersistence();
		p.persist();
	}
}
	