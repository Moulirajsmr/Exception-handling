package com.smr.testing;

public class Userdefined_Handling {
	
	public static void main(String[] args)throws My_Exception {
		
		int Rupee = 80;
		
		if (Rupee >= 100) {
			
			System.out.println("Ticket is Booked");
			
		} else {
			
			throw new My_Exception ("Reason : Not sufficient money");

		}
		
		System.out.println("New Feed");
	}

}
