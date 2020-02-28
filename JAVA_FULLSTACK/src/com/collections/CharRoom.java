package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
class UserList implements Comparable<UserList>
{	private int age;
	private String name;
	private String pwd;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "UserList [age=" + age + ", name=" + name + ", pwd=" + pwd + "]"+"\n";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public UserList(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age=age;
	}
	//@Override
/*	public int compareTo(UserList o) {
		if(this.name.compareTo(o.name)==1)
		return 1;
		else
			return -1;
	}*/
	@Override
	public int compareTo(UserList o) {
		if(this.age < o.age)
			return 1;
		else
			return -1;
		
	}

	
	
}
public class CharRoom {
	static TreeSet<UserList> usersList = new TreeSet<UserList>(); 
	static ArrayList<String> msgList = new ArrayList<String>();
	static Map<String,TreeSet > hmapUsers=new HashMap<String,TreeSet>();
	static	 Map<String,ArrayList > hmapMsg=new HashMap<String,ArrayList>();
	
	

	public static void main(String[] args) throws InterruptedException {
		int again =1;
		//-----------------------------------------------------------------
	
		//-----------------------------------------------------------------
		 
		/* usersList.add("Aman");
		 usersList.add("GAURAB");
		 usersList.add("Aman");
		hmapUsers.put("SPORTS" , usersList);
		hmapUsers.put("COMPUTERS",usersList);
		
		Iterator<String> itr=hmapUsers.keySet().iterator();
		while(itr.hasNext())
		{
			String n=itr.next();
			System.out.println(n+" "+hmapUsers.get(n));*/
		
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
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		do{
		 System.out.println("A : Create chatRoom\nB : Add User\nC : Userlogin"
		 		+ "D: Send Message\nE: Display Specific ChatRoom Message\n"
		 		+ "F: List spcific ChatRoom Users\n"
		 		+ "G: Logout\n"
		 		+ "H: Delete a user\n");
		 System.out.print("\nPlease Select Option   :\t");
		 String choiceMain;
		 Scanner sc=new Scanner(System.in);
		 Scanner sc2=new Scanner(System.in);
		 choiceMain=sc.next();
		 Iterator<String> itr= hmapUsers.keySet().iterator();
		 boolean isKeyPresent = false;
		 switch(choiceMain)
		 {
		 case "A": {
			
			 		String chatRoom="";
			 		System.out.print("\nEnter the Name of the chatroom you want to create :  ");
			 		chatRoom=sc.next();
			 		if(hmapUsers.containsKey(chatRoom))
			 			isKeyPresent = true;
			 		else
			 			isKeyPresent = false;
			 		if(isKeyPresent==true)
			 			{
			 			System.out.println("\n\n\t\t\t !!!!!!ChatRoom with this name already Exists !!!!!");
	 			     	System.exit(0);
			 			}
			 		
			 		else {
			 		hmapUsers.put(chatRoom , usersList);
			 		hmapMsg.put(chatRoom,msgList);
			 		System.out.println("\nChatroom "+chatRoom+" Created !!");
			 		}
		 }  break;
		 
		 case "B" : {
			 System.out.print("Enter the chatroom you want to enter : ");
			 String cr="";
			 cr=sc.next();
			 boolean iscrPresent=false;
			if(hmapUsers.containsKey(cr))
		 			iscrPresent = true;
		 		else
		 			iscrPresent = false;		
		 		if(iscrPresent==false)
		 			{
		 			System.out.println("\n\n\t\t\t !!!!!!ChatRoom with this name dosen't Exists !!!!!");
		 			System.exit(0);
		 			}

		 		else {
		 				 UserList ul;
		 				 /*System.out.print("Enter first Name : ");
						 String first=sc.next();
						 first=sc.next();*/
						 System.out.print("Enter UserName : ");
						// String name=sc.next();
						 String name = sc.next();
						 System.out.print("Enter Password : ");
						 //String pwd=sc.next();
						 String pwd = sc.next();
						 System.out.print("Enter Age : ");
						 int age=sc2.nextInt();
			 			 System.out.println("Adding User....");
						 Thread.sleep(500);
						 //usersList.add(name);
						 //ul=new UserList(name,pwd);
						 usersList.add(new UserList(name,pwd,age));
						 hmapUsers.put(cr,usersList);
						 //System.out.println(ul);
						Iterator<String> itr1=hmapUsers.keySet().iterator();
							while(itr1.hasNext())
							{
								String n=itr1.next();
								System.out.println(n+" "+hmapUsers.get(n));
							}
						 
		 					 		}
			 
		 }
		 }
		 System.out.print("\nMain Menu : 1    Exit : 0  : ");
		 again=sc2.nextInt();
		}while(again==1);
		 
		 
		 
		
	}

}
