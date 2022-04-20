package com.dxc.Assessment;

public class Hello {
	
		static int x = 1;
		private int y = 3;
		public void method1(int x)
		{
			Hello h = new Hello();
			this.x = 2;
			y = 4;

			System.out.println("Test.x: " + Hello.x);
			System.out.println("t.x: " + h.x);
			System.out.println("t.y: " + h.y);
			System.out.println("y: " + y);
		}

		public static void main(String args[])
		{
			Hello h = new Hello();
			h.method1(5);
		}
	}


