package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(6);
		hs.add(5);
		System.out.println("Size of the hash set is = "+hs.size());
		hs.remove(5);
		
		System.out.println("Removing one element which is not present in the set :"+hs.remove(8));
		
		//Use the contains() method to check if an item is in the Set or not
		System.out.println(hs.contains(100));
		
		System.out.println(hs);

		

	}

}
