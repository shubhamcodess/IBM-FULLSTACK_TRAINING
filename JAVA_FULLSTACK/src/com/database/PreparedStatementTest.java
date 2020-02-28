package com.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementTest {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","darkevil");
		System.out.println("Connection established !!\n");
		PreparedStatement pstmt=dbcon.prepareStatement("INSERT INTO CONTACT VALUES(?,?,?)" );
		pstmt.setInt(1, 21);
		pstmt.setString(2,"joy");
		pstmt.setString(3,"5582");
		int rs=pstmt.executeUpdate();
		System.out.println("record Added");
		
		String query = "delete from contact where id = ?";
	      pstmt = dbcon.prepareStatement(query);
	      pstmt.setInt(1,11);

	      // execute the preparedstatement
	      pstmt.executeUpdate();
	      System.out.println("record deleted"); 
	      System.out.println("Printing record");
	      
	      String select="select * from contact";
PreparedStatement ps=dbcon.prepareStatement(select);
ResultSet rs1=ps.executeQuery();
while(rs1.next())
{
	int id=rs1.getInt("Id");
	String name=rs1.getString("NAME");
	String ph=rs1.getString("PHONE");
	
	System.out.println(id+"- "+name+" - "+ph);
	
	
}
System.out.println("\nAfter Updating\n");
String update="UPDATE contact SET NAME=? WHERE Id=?";
pstmt=dbcon.prepareStatement(update);
pstmt.setInt(2, 21);
pstmt.setString(1, "Tanny");
pstmt.executeUpdate();
PreparedStatement ps1=dbcon.prepareStatement(select);
ResultSet rs11=ps1.executeQuery();
while(rs11.next())
{
	int id=rs11.getInt("Id");
	String name=rs11.getString("NAME");
	String ph=rs11.getString("PHONE");
	
	System.out.println(id+"- "+name+" - "+ph);
	
	
}






	}
		
	

}
