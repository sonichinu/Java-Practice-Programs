package com.javaPrograms;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// ArrayList of Strings
        List<String> myList = new java.util.ArrayList<>();

        // Adding elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Mango");

        // Accessing elements using loop
        System.out.println("Elements in the ArrayList:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Adding an element at a specific index
        myList.add(2, "Grapes");

        // Removing an element by value
        myList.remove("Orange");

        // Modifying an element at a specific index
        myList.set(3, "Pineapple");

        // Checking if the ArrayList contains an element
        if (myList.contains("Banana")) {
            System.out.println("Banana is in the list.");
        }

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + myList.size());

        // Clearing the ArrayList
        myList.clear();

        // Checking if the ArrayList is empty
        if (myList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        }
    }
}

