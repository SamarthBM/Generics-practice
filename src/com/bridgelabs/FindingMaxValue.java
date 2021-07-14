/****************************************************************
 * Purpose : To use generic method to find maximum value.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class FindingMaxValue {
	/*
	 * Method to compare three integer values and get the maximum value.
	 * 
	 * @param a1: first value to compare.
	 * 
	 * @param a2: second value to compare.
	 * 
	 * @param a3: third value to compare.
	 */
	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		Integer a1 = 10, a2 = 8, a3 = 9;
		System.out.println("Maximum value is : " + maxOfInteger(a1, a2, a3));

	}

}
