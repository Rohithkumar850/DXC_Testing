package com.dxc.function2;

//public class Thread1 extends Thread{
public class Thread1 implements Runnable{
	public void run() {
		System.out.println("This is a Run Method");
	}
	
	public static void main(String args[]) {
	Thread1 t1=new Thread1();
	Thread1 t2=new Thread1();
	Thread t=new Thread(t1);
	Thread tt=new Thread(t2);
	t.start();
	tt.start();
	
		
	}

}
