package com.dxc.rohith;

public class Exception1 {
	public static void main(String args[]) {
		String s=null;
		try {
			s.length();	
		}
	catch(NullPointerException Ex) {
		System.out.println(Ex.getMessage());
		Ex.printStackTrace();
	}
		
		int a[]= {1,2,3};
		try {
			System.out.println(a[3]);	
		
		}
		finally {
			System.out.println("Exception Occured");
		}
		
	}

}
