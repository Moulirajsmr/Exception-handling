package com.smr.testing;

public class Userdeined_Rollnumber {
	

public static void main(String[] args)throws My_Exception {
		
		int Height = 4;
		int Weight = 55;
		
		if ( Height >= 5 && Weight >= 50) {
			
			System.out.println("Good Height & Weight");
			
		} else {
			
			throw new My_Exception ("Reason : Malnutrient");

		}
		
		System.out.println("New Feed");

}
}