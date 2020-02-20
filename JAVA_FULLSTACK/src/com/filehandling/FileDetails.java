package com.filehandling;

import java.io.*;
import java.text.SimpleDateFormat;

public class FileDetails {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\fun.txt");
		System.out.println("File Name : "+file.getName());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("date Created : "+sdf.format(file.lastModified()));
		System.out.println("File Path : "+file.getPath());
		System.out.println("File length : "+file.length());
		System.out.println("Executable : "+file.canExecute());
		System.out.println("Readable : "+file.canRead());
		System.out.println("Writeable : "+file.canWrite());

	}

}
