package com.gc.lists;

import java.util.Arrays;

public class FrequencyOutput {

	public static void main(String[] args) {
		/*
		 * Algorithm:
		 * 
		 * START
		 * 
		 * Sort the array numerically 
		 * Set up a loop to step through the array 
		 * For the value at each array index, store the value 
		 * Initiate a counter set to zero
		 * Check how many other indices contain the same value 
		 * Store the number of occurrences in the counter 
		 * As long as the value hasn't already been printed, print the value and counter
		 * 
		 * STOP
		 * 
		 */

		int[] example = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };

		Arrays.sort(example);

		for (int i = 0; i < example.length; i++) {
			int value = example[i];
			int counter = 0;
			for (int j = 0; j < example.length; j++) {

				if (example[j] == value) {
					counter++;
				}
			}
			if ((i < example.length - 1) && (value != example[i + 1]) || (i == example.length - 1)) {
				System.out.println("[" + value + "]: " + counter);
			}
		}
	}
}
