package arraysinterviewquestions;

import java.util.ArrayList;
import java.util.List;

public class CommonElementArray {

	public static void main(String args[]) {

		int arr[] = { 1, 1, 2, 3, 4, 5, 6, 7 }

		;
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {

				if ((arr[i] != arr[j])) {

					if (!l.contains(arr[i])) {

						l.add(arr[i]);
					}

				}

			}

		}

		System.out.println(l);

	}

}
