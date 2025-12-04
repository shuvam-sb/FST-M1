package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Shuvam");
		myList.add("Richard");
		myList.add("Bob");
		myList.add("Martin");
		myList.add("Erin");
		for(String name : myList) {
			System.out.println(name);
		}
		//Printing 3rd element from the list
		System.out.println("Third member in the list = "+myList.get(2));
		//Check if bob exist
		String checkName = "Bob";
		if(myList.contains(checkName))
			System.out.println(checkName+" is present in the List");
		else {
			System.out.println(checkName+" is not present in the list");
		}
		System.out.println("Current size of the list = "+myList.size());
		//After removing 1 element print the size of the list
		myList.remove(2);
		System.out.println("Size of the List after removing 1 element = "+myList.size());
	}

}
