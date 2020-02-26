package com.filehandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CrudTest {

	public static int count=0;
	public static File f ;
	public static RandomAccessFile raf;
	
	public CrudTest() throws FileNotFoundException
	{
		f= new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\newaccounts3.dat");
		raf = new RandomAccessFile(f, "rw"); 
	}
	
	public static void insertRecord(int no,String name,double sal) throws IOException
	{
		//raf.writeUTF("Acc No :");
		raf.writeInt(no);
		//raf.writeUTF("Name :");
		raf.writeUTF(name);
		//raf.writeUTF("Salary :");
		raf.writeDouble(sal);	
		
	}
	
	public static void readRecord() throws IOException
	{
		if(raf.getFilePointer()==0)
		{
			System.out.println("Nothing to print in the Database");
		}
		
			try {
		
				raf.seek(0);
				System.out.println("Account Details  ");
				for(int i=0;i<count;i++)
				{
					System.out.print("Account Number  : "+raf.readInt()+"  Name : "+raf.readUTF()+" Salary : "+raf.readDouble()+"\n" );
					//System.out.println(raf.readUTF()+raf.readInt()+"\t"+raf.readUTF()+raf.readUTF()+"\t"+raf.readUTF()+raf.readDouble());
				}
		
			}
		
			catch(EOFException e)
			{
				//System.out.println("File ended here !");	
			}	
	}
	
	public static void deleteRecords() throws IOException 
	{	
		raf.setLength(0);
		System.out.println("Record deleted");	
		
	}
	
	public static void updateRecord(int oldAccountNo, String oldName, double oldSalary,int newAccountNo , String newName, double newSalary) throws IOException 
	{
		try {
			System.out.println("Record Updated");
			raf.seek(0);
			for(int i=0;i<raf.length()-1;i++)
			{
				int acc=raf.readInt();
				String n=raf.readUTF();
				double sal=raf.readDouble();
				
				if(acc==oldAccountNo && n.equals(oldName) && sal==oldSalary)
				{
					raf.writeInt(newAccountNo);
					raf.writeUTF(newName);
					raf.writeDouble(newSalary);
					/*acc=newAccountNo;
					n=newName;
					sal=newSalary;*/
					System.out.println("Record Updated");
				}
				
			}
			System.out.println("Record Updated");
		}
		catch(EOFException e)
		{
			
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		int ch3=0;
		new CrudTest();
		do {
		System.out.println("\n1)Add records  2)Read  3)Update  4)delete");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1)
		{
				
			/*System.out.println("Enter Details to add ");
			System.out.print("Name : ");
			String name=sc.next();
			System.out.print("Account Id : ");
			int acc=sc.nextInt();
			System.out.print("Salary : ");
			double sal=sc.nextInt();
			insertRecord(acc,name,sal);
			System.out.println("\nRecord Added");
			System.out.println("Fp  "+raf.getFilePointer());
			System.out.print("Want to add more Y:1  N:0  -> ");
			ch2=sc.nextInt();*/
			insertRecord(1,"ABC",23);count++;
			insertRecord(2,"DEF",43);count++;
			insertRecord(3,"EHI",56);count++;
			System.out.println("\nRecord Added");
			System.out.println("Fp  "+raf.getFilePointer());
			
		}
		
		else if(ch==2) 
		{
			readRecord();
		}
			
		else if(ch==4)
		{
			//System.out.println("Curent File Pointer : "+raf.getFilePointer());
			//raf.seek(0);
			deleteRecords();
		}
			
		else if(ch==3)
		{
			updateRecord(1,"ABC",23.0,111,"ROBIN",500.0);
		}
		System.out.print("\nWant to continue to main menu Y:1  N:0  -> ");
		ch3=sc.nextInt();
		
		}while(ch3==1);
		raf.close();
	
	}
	

}
