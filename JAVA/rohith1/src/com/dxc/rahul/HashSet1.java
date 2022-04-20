package com.dxc.rahul;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	public static void main(String args[]) {
		Set<String> s=new HashSet<>();
		s.add("Hello");
		s.add(null);
		s.add("Hello");
		s.add("JAVA");
		
		for(Object obj :s ) {
			System.out.println(obj);
			
		}
	}

}
