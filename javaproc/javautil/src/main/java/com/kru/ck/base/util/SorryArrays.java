package com.kru.ck.base.util;

import java.util.Arrays;

public class SorryArrays {
	public static void main(String[] args) {

		objectArray();
		System.out.println("===============");
	}

	public static void objectArray() {

		// Object[] array = {2, 4.f, 2.0, "Hello", "How are you", new Object(),
		// new Pair(), false, true};
		Object[] array = { 2, 4.f, 2.0, "Hello", "How are you", false, true };
		printArray(array);

		// Sort partial array.
		Arrays.sort(array, 3, 6);
		printArray(array);

		// Sort the complete array.
		Arrays.sort(array);
		printArray(array);
	}

	public static void printArray(Object[] array) {
		for (Object obj : array)
			System.out.print(obj + ", ");
		System.out.println();
	}
}
