/****************************************************************
 * Purpose : To use generic method to find maximum value.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class FindingMaxValue {
	/*
	 * Generic method to compare any type of data.
	 * 
	 * @param a1: first value to compare.
	 * 
	 * @param a2: second value to compare.
	 * 
	 * @param a3: third value to compare.
	 */
	public static <T extends Comparable<T>> T maxOFValues(T a1, T a2, T a3) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;

	}
	public static void main(String[] args) {
		Integer a1 = 10, a2 = 8, a3 = 9;
		System.out.println("Maximum value is : " + maxOFValues(a1, a2, a3));

		Float b1 = 10.8f, b2 = 12.9f, b3 = 9.9f;
		System.out.println("Maximum value is : " + maxOFValues(b1, b2, b3));

		String c1 = "S", c2 = "A", c3 = "M";
		System.out.println("Maximum value is : " + maxOFValues(c1, c2, c3));

	}

}
