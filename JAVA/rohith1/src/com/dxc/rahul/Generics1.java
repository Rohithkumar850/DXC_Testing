package com.dxc.rahul;

class Demo <T extends Number>{
	void display() {
		System.out.println("Generics Demo");
	}
}

public class Generics1 {
	public static void main(String args[]) {
		Demo<Float> d=new Demo<>();
		d.display();
	}

}
	