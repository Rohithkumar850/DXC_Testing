package com.dxc.rohith;

public class Exception2 {
	
	public static void display() throws Exception { 
		throw new Exception("Throwing");
	}
	public static void main(String args[]) {
		try {
			display();	
		}
		catch(Exception Ex) {
			
			Ex.printStackTrace();
		}
		finally {
			System.out.println("problem Occured");
		}
		
	}

}
