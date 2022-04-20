package com.dxc.rahul;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String args[]) {
		List lst=new ArrayList();
		lst.add("ABC");
		lst.add(123);
		lst.add(2.2f);
		for(Object obj:lst) {
			System.out.println(obj.toString());
		}
		
	}

}
