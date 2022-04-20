package com.dxc.function2;

public class Overriding {
	//Java Program to demonstrate why we need method overriding  
	 //Creating a parent class  
	   void run(){System.out.println("Vehicle is running"); }
	}  
	//Creating a child class  
	class Bike extends Overriding{  
	  public static void main(String args[]){  
	  //creating an instance of child class  
	  Bike obj = new Bike();  
	  //calling the method with child class instance  
	  obj.run();  
	  }  
	}  


