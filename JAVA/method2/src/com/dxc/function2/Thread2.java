package com.dxc.function2;

public class Thread2 implements Runnable{
	public void run() {
		
		System.out.println("Run");
	}
	
	public static void main(String args[]) {
	Thread2 t1=new Thread2();
	Thread t=new Thread(t1);
	t.start();
	try {
	//	Thread.sleep(10000);
		synchronized(t1) {
			t1.wait(10000);
		}
		
		System.out.println("Woke up");
	}
	
	catch(Exception e) {
		e.printStackTrace();
		
	}
		
	}

}
