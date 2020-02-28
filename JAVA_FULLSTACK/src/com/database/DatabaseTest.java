package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","darkevil");
		System.out.println("Connection established !!\n");
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM CONTACT");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String name=rs.getString("NAME");
			String ph=rs.getString("PHONE");
			
			System.out.println(id+"- "+name+" - "+ph);
			
		}
		System.out.println("\nAfter DML - UPDATE\n");
		//int c=stmt.executeUpdate("INSERT into CONTACT(Id,NAME,PHONE)" + "values (10, 'arvin','45552') ") ;
		//System.out.println(c);
		rs=stmt.executeQuery("SELECT * FROM CONTACT");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String name=rs.getString("NAME");
			String ph=rs.getString("PHONE");
			
			System.out.println(id+"- "+name+" - "+ph);
			
			
		}
		System.out.println("\nAfter DML- DELETE\n");
		int c1=stmt.executeUpdate("DELETE FROM CONTACT WHERE NAME='nav' ") ;
		rs=stmt.executeQuery("SELECT * FROM CONTACT");
		while(rs.next())
		{
			int id=rs.getInt("Id");
			String name=rs.getString("NAME");
			String ph=rs.getString("PHONE");
			
			System.out.println(id+"- "+name+" - "+ph);
			
			
		}
		
		
		
	

		//rs.close();
		stmt.close();
		dbcon.close();
	}

}
