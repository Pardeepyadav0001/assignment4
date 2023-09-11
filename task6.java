package assignment4;

import java.util.ArrayList;
import java.util.Collections;

//Given a list of integers, find the maximum value element present in it
public class task6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5); // decalre the arraylist

		list.add(23);
		list.add(33);
		list.add(55);
		list.add(95);

		System.out.println("Max val: " + Collections.max(list, null));
	}

}
