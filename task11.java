package assignment4;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find sum of all the odd integers
public class task11 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(54, 27, 92, 55, 26, 95);
		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			int n = list.get(i);
			// System.out.println(list.get(i));

			if (!(n % 2 == 0)) {
				System.out.println(n);
				sum += n;

			}

		}

		System.out.println("sum :" + sum);
	}
}
