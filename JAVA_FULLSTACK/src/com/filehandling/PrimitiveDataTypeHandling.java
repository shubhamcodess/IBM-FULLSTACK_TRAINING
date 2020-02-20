package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveDataTypeHandling {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\Account.dat");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
	
		dos.writeInt(111);
		dos.writeDouble(12000.85);
		dos.writeUTF("Harley");
		

		dos.writeInt(222);
		dos.writeDouble(15000.19);
		dos.writeUTF("Bruce");
		
		
		dos.writeInt(333);
		dos.writeDouble(60000.85);
		dos.writeUTF("Clark");
		
		
		
		File file2 = new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\Account.dat");
		FileInputStream fis = new FileInputStream(file2);
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0;i<3;i++) {
		int id = dis.readInt();
		double salary = dis.readDouble();
		String name = dis.readUTF();
		
		System.out.println("id : "+id+" Salary : "+salary+" Name : "+name);
		}
		
	
		
		dis.close();
		fis.close();
		
		
		

		
	}

}
