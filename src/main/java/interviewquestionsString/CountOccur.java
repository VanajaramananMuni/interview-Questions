package interviewquestionsString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountOccur {

	public static void main(String[] args) {
		String name = "vanaja vanaja ramanan";
		String[] spac = name.replace("\\s", "").split(" ");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String iter : spac) {

			if (hm.containsKey(iter)) {

				hm.put(iter, hm.get(iter) + 1);
			}

			else {

				hm.put(iter, 1);
			}
		}

		System.out.println(hm);

		// 2nd method like only if contains abc remove that string.

		List<String> hs = new ArrayList<>();
		hs.add("vanajaramanan");
		hs.add("madhu");
		hs.add("ramanan");

		hs.removeIf(str -> str.endsWith("dhu"));

		System.out.println(hs);

	}

}
