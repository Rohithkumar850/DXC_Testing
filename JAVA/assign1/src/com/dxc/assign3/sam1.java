package com.dxc.assign3;

public class sam1 {
	// Java Program to check the size
	// using the switch...case statement

	
	  public static void main(String[] args) {

	    int number = 32;
	    String size;

	    // switch statement to check size
	    switch (number) {

	      case 1:
	        size = "Small";
	        break;

	      case 2:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 3:
	        size = "Large";
	        break;

	      case 4:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
	  }
	}


