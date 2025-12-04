package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> colours = new HashMap<Integer, String>();
		colours.put(1,"Green");
		colours.put(2,"Yellow");
		colours.put(3,"Red");
		colours.put(4,"Indigo");
		colours.put(5,"Violet");
		
		colours.remove(2);
		//Check if the colour green exists in the Map using the containsValue() method
		System.out.println(colours.containsValue("Green"));
		//Print size of the updated Map.
		System.out.println(colours.size());

		
		

	}

}
