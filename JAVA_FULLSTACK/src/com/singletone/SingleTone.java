package com.singletone;

class SampleSingletone{
	private static SampleSingletone ref=null;
	SampleSingletone(){}
	public static SampleSingletone getInstance(){
		if(ref==null)
			ref=new SampleSingletone();
		return ref;
	}
}
public class SingleTone{
public static void main(String args[])
{
	SampleSingletone ob1=new SampleSingletone();
}
}