package arraysinterviewquestions;

import java.util.Arrays;

public class InsertArray {

	public static void main(String args[]) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int index = 4;
		int value = 45;

		int[] arr1 = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {

			arr1[i] = arr[i];

		}
		arr1[index] = value;

		for (int i = index; i < arr.length; i++) {

			arr1[i + 1] = arr[i];
		}

		System.out.println(Arrays.toString(arr1));
	}

}
