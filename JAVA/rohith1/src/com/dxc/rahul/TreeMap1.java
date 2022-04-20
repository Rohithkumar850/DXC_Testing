package com.dxc.rahul;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String args[]) {
		Map<String,Integer> numbers=new TreeMap<>();
		try {
			numbers.put("One",1);
			numbers.put("Two", 2);
			numbers.put("Three", 3);
			numbers.put("One",1);
			System.out.println("TreeMap:"+numbers);
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
