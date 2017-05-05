package com.exception.multiplereturn;

public class MultipleReturn {

	static int returnMultiValue() {
		int nValue = 10;
		try {
			String[] arrName = {"ravi","ranjan"};
			System.out.println("NAme is : " + arrName[4]);
		}catch(Exception e) {
			System.out.println("caught in cache block");
			nValue++;
			return nValue;
			
		}finally {
			//does not change value of nValue to 50 since it is locally getting changes inside final and not returning 
			//to main function.
			nValue = 50;
			System.out.println("return from final");
			
		}
		/*	this will not execute because return is already triggered in catch block so it will just go to
		*	finally block and come back to catch block if there is no any return available in finally block.
		*	and return from catch block.
		*/
		System.out.println("will this line execute");
		return nValue;
	}
	
	static int returnMultiValues() {
		try {
			String[] arrName = {"ravi","ranjan"};
			System.out.println("NAme is : " + arrName[4]);
		}catch(Exception e) {
			System.out.println("caught in cache block");
			return 10;
			
		}finally {
			System.out.println("return from final");
			return 50;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("value : " + returnMultiValues() );
		System.out.println("value after return only from catche: " + returnMultiValue() );
	}
}

----------------------------------------------------

output : - 

caught in cache block
return from final
value : 50
caught in cache block
return from final
value after return only from catche: 11

		-------------------------------------------------
