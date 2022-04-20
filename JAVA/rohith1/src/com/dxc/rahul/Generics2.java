package com.dxc.rahul;

public class Generics2 {
	public static void main(String args[]) {
		Integer[] i= {1,2,3,4,5};
		Character[] ch= {'A','B','C'};
		String[] str= {"Rohith","Rahul","Hello World"};
		Float[] flt= {12.4f,3.4f,7.8f};
		display(i);
		display(ch);
		display(str);
		display(flt);
	}
	public static <P> void display(P[] X) {
		for(P any:X) {
			System.out.println(any);
			
		}
		
	}

}
