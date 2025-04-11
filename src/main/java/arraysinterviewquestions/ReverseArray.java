package arraysinterviewquestions;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// 1st method of revering the array

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		
		int arrs[] = new int[arr.length];

		
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i]);
			arrs[arr.length - 1 - i] = arr[i];
			;
		}

		// 2nd method of revering the array

		System.out.println(Arrays.toString(arrs));
		System.out.println(arrs);

	}

}
