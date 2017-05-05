package com.exception.skipfinally;

public class SkipFinalBlock {

	static void skipFinallyBlock() {
		try {
			String[] arrName = {"ravi","ranjan"};
			System.out.println("Name : " + arrName[10]);
		}catch(Exception e) {
			System.out.println("from catch block");
			//close the application itself. won't go to finally block
			System.exit(0);
		}
		//this finally will not able execute.
		finally {
			System.out.println("from finally block");
		}
	}
	public static void main(String[] args) {
		skipFinallyBlock();
	}

}


---------------------------------------------

output : - from catch block

-----------------------------------------------