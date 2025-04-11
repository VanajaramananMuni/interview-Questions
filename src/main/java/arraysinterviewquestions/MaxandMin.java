package arraysinterviewquestions;

import java.util.Arrays;

public class MaxandMin {

	public static void main(String[] args) {

		int arr[] = { 1, 10, 2, 5, 4, 3, 6, 7, 8, 9, }

		;

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 2nd method not using inbuild methods.

		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[i] > arr[j]) {

					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(arr));

		// find minimum value of array

		System.out.println("minimum value of array " + " " + arr[0]);

		// find max value of array
		int size = arr.length;

		System.out.println("Maximum value of array "+""+arr[size - 1]);

	}

}
