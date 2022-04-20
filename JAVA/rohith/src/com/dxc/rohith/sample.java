package com.dxc.rohith;
public class sample {
 int x=12;
int y=34;
int z=56;

void display() {
	System.out.println(x+y+z);
}
public static void main(String args[]) {
	sample s= new sample();
	if(s.x>s.y && s.x>s.z){
		System.out.println("x is greater");
	}
		else if(s.y>s.z && s.y>s.x)
		{
			System.out.println("y is greater");
			
		}
		else {
			System.out.println("z is greater");
		}
	s.display();
		
	}
}
			 
			
		

	
		
			 
	


