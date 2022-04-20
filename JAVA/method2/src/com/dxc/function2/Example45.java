package com.dxc.function2;

import java.io.FileReader;

public class Example45 {
	public static void main(String args[]) {
try {
			
			FileReader f1=new FileReader("D:\\Dxc\\File2.txt");
			f1.read();
			f1.close();
		}
			//if(f1.createNewFile()) {
				//System.out.println("New File is Created");
			
		
		catch(Exception e) {
			e.printStackTrace();
			
	}

}
}
