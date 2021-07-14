/****************************************************************
 * Purpose : To use generic method to find maximum value.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Arrays;

public class FindingMaxValue<T extends Comparable<T>> {

	T[] elements;

	public FindingMaxValue(T[] elements) {
		this.elements = elements;
	}
	/*
	 * Generic method to extend to.print max value to standard output.
	 * 
	 * @param elements: elements in array.
	 * 
	 * @param max: max value in array
	 * 
	 */

	public static <T> void printMax(T[] elements, T max) {
		for (T element : elements) {
			System.out.println(element);
		}
		System.out.printf("%d of %d is: ", max, elements);
	}

	/*
	 * Generic method to store values in array and return maximum value.
	 * 
	 * @param elements.
	 * 
	 */
	public static <T extends Comparable<T>> T maxOFValues(T[] elements) {
		Arrays.sort(elements);
		int lenght = elements.length;
		T max = elements[lenght - 1];
		return max;
	}

	public static void main(String[] args) {

		Integer[] intMax = { 1, 82, 5, 80, 4, 87, 100, 58 };
		System.out.println("Maximum value is: " + maxOFValues(intMax));

		Float[] floatMax = { 1.6f, 87.8f, 82.8f, 80.2f, 4.8f };
		System.out.println("Maximum value is: " + maxOFValues(floatMax));

		String[] stringMax = { "S", "A", "M" };
		System.out.println("Maximum value is: " + maxOFValues(stringMax));

	}

}