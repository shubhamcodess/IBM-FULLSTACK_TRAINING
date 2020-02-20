package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fin1=new FileInputStream("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\fun.txt");
		FileInputStream fin2=new FileInputStream("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\fun2.txt");
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1){
		System.out.print((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();

	}

}
