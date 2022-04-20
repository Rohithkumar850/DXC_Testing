package com.dxc.rahul;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String args[]) {
		HashMap<String,Integer> numbers = new HashMap<>();
		numbers.put("Rohith",123);
		numbers.put("Varun",254);
		numbers.put("Rohith",457);
		for(Object obj:numbers.keySet())
		System.out.println(obj);
		
		for(Object obj:numbers.values())
			System.out.println(obj);	
	}
	

}