package com.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class CharRoom {
	static TreeSet<String> usersList = new TreeSet<String>(); 
	static List<String> msgList = new ArrayList<String>();
	static Map<String,TreeSet > hmapUsers=new HashMap<String,TreeSet>();
	static	 Map<String,ArrayList > hmapMsg=new HashMap<String,ArrayList>();

	public static void main(String[] args) {
		//-----------------------------------------------------------------
	
		//-----------------------------------------------------------------
		 
		/* usersList.add("Aman");
		 usersList.add("GAURAB");
		 usersList.add("Aman");
		hmapUsers.put("SPORTS" , usersList);
		hmapUsers.put("COMPUTERS",usersList);
		*/
		Iterator<String> itr=hmapUsers.keySet().iterator();
		while(itr.hasNext())
		{
			String n=itr.next();
			System.out.println(n+" "+hmapUsers.get(n));
		}
		//------------------------------------------------------------
		/*StringBuilder s1=new StringBuilder("Welcome To ChatRoom\r");
		for(int i=0;i<50;i++)
		{
		char c=s1.charAt(s1.length()-1);
	
		s1.insert(0,c);
		System.out.print(s1+"\r");
		s1.deleteCharAt(s1.length()-1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}*/
		//---------------------------------------------------------------
		
		 System.out.println("\n\n\n\t\t\t\tWelcom to ChatRoom\r\n\n");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		 System.out.println("A : Create chatRoom\nB : Add User\nC : Userlogin"
		 		+ "D: Send Message\nE: Display Specific ChatRoom Message\n"
		 		+ "F: List spcific ChatRoom Users\n"
		 		+ "G: Logout\n"
		 		+ "H: Delete a user");
		 System.out.print("\nPlease Select Option   :\t");
		 String choiceMain;
		 Scanner sc=new Scanner(System.in);
		 choiceMain=sc.next();
		 
		 switch(choiceMain)
		 {
		 case "A": {
			 		String chatRoom="";
			 		System.out.println("Enter the Name");
		 }
		 }
		 
		 
		 
		
	}

}
