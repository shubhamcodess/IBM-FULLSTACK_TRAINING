package com.filehandling;

import java.io.*;


public class FileReadWrite {

	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\fun.txt");
		FileInputStream fis = new FileInputStream(file);
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		do {
		i = fis.read();
		if(i != -1)
		sb.append((char)i);
		}
		while(i != -1);
		System.out.println("File contents: " + sb);
		fis.close();
		
		File file2 = new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\fun2.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		String s=new String(sb);
		fos.write(s.getBytes());
		System.out.println("New File created go check it ");
		
		fos.flush();
		fos.close();
		
		
		

	}

}
