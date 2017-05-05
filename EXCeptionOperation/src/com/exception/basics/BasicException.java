package com.exception.basics;

public class BasicException {

	static void performException() {
		
		try {
			String[] arrName = {"ravi", "ranjan"};
			System.out.println("NAme from try block is :" + arrName[5]);
		}catch(Exception e) {
			System.out.println("Exception caught in catche block");
		}finally{
			System.out.println("doesn't care return statment in catch block "+"\nfinal block is being executed");
		}
		System.out.println("end line of the function");
	}
	public static void main(String[] args) {
		
		performException();
	}
}

---------------------------------------------

output : - 

Exception caught in catche block
doesn't care return statment in catch block 
final block is being executed
end line of the function
-------------------------------------------------------------------