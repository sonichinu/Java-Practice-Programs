package com.javaprograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList()<>();

        // Adding elements to the List
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Displaying elements in the List using loop
        System.out.println("Elements in the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Removing an element from the List
        linkedList.remove("Orange");

        // Adding an element at a specific index
        linkedList.add(2, "Grapes");

        // Getting the size of the LinkedList 
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // Checking if the LinkedList is empty using isEmpty()
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }

        // Clearing the LinkedList
        linkedList.clear();

        // Checking if the LinkedList is empty after clearing
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty after clearing.");
        } else {
            System.out.println("The LinkedList is not empty after clearing.");
        }
    }
}

