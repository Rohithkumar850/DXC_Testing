package com.dxc.function;

import java.io.FileWriter;

public class Example5 {
	public static void main(String args[]) {
		
		try {
			
			FileWriter f1=new FileWriter("D:\\Dxc\\File2.txt");
			f1.write("Writing to the File");
			f1.close();
		}
			//if(f1.createNewFile()) {
				//System.out.println("New File is Created");
			
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		}
	}


