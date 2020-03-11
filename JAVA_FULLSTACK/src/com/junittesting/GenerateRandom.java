package com.junittesting;

import java.util.Random;

public class GenerateRandom {

	Random rand=new Random();
	public int x=0;
	
	public int getRandom()
	{	
		x=rand.nextInt(100);
		return x; 
			
	}

	public boolean checkIfUnder100(int rand2) {
		if(rand2<=100)
			return true;
		else
		return false;
	}
	
	
}
