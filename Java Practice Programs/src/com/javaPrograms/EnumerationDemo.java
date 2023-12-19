package com.javaPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
//		Apply only for legecy classes
		 Vector<String> vector = new Vector<>();
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");

	        Enumeration<String> enumeration = vector.elements();
	        while (enumeration.hasMoreElements()) {
	        	String s = (String)enumeration.nextElement();
	        	s= s + "Hello";
	            System.out.println(s);
//	            We can perform business logics for filtering or updation
	        }
	    }
}
