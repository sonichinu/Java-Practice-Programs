package com.javaPrograms;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		  java.util.ArrayList<Integer> list = new java.util.ArrayList();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);

	        Iterator<Integer> iterator = list.iterator();
	        while (iterator.hasNext()) {
	        	
//	        	perform both read and remove operations
	        	int i = (Integer)iterator.next();
	        	if(i%2!=0) {
	        		System.out.println(i);
	        	}
	        	else {
	        		iterator.remove();
	        	}
	        }
	        System.out.println(list);
	    }
}
