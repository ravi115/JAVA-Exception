package com.exception.exceptionorder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrederOfException {

	static void  getOrderOfException() {
		FileInputStream  fin;
		try {
			fin = new FileInputStream("text.txt");
			fin.close();
		}catch(IOException e) {
			System.out.println("caught IOException");
		}
		/*
		 * This order of catching exception is wrong. 
		 * giving compilation error. 
		 * because FileNotFound exception is the derived class of IOExecption class. 
		 * so we cannot catch a exception of base class before its derived class. 
		 * 
		 */
		catch(FileNotFoundException f) {
			System.out.println("file not found exception");
		}
	}
	public static void main(String[] args) {
		
	}
}


----------------------------------
compilation falied
-----------------------