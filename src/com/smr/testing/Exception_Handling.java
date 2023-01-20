package com.smr.testing;

public class Exception_Handling {
	
	public static void main(String[] args) {
		int a = 100;
		try {
			System.out.println(a+2);
		    System.out.println(a/0);
			
		}catch(NullPointerException e){
			System.out.println("dived by zero");
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("can't divide a number by zero");
		}
		
		
	}

}
