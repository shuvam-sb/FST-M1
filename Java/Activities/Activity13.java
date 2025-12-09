package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> alist = new ArrayList<Integer>();
		Random indexGen = new Random();
		while(scan.hasNextInt()) {
			alist.add(scan.nextInt());
		}
		Integer[] nums = alist.toArray(Integer[]::new);
		int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
 
        scan.close();
	}

}
