package com.dxc.sample23;

 interface ABC {
	public static final int x=5;
	void display();

}
 public class EX implements ABC{
public void display() {
	System.out.println("Iam in the Implemented class");
}
public static void main(String args[]) {
	EX e=new EX();
	//EX.x=7;
	e.display();
}
}
