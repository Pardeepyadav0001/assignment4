package assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given a list of integers, sort all the values present in it in descending order.
public class task10 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(54, 27, 92, 55, 26, 95);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);
	}

}
