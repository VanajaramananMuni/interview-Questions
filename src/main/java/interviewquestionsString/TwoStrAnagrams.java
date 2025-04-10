package interviewquestionsString;

import java.util.Arrays;

public class TwoStrAnagrams {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "madam";

		str1 = str1.replace("\\s", "").toLowerCase();
		str2 = str2.replace("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("not an anagram");

		} else {
			char[] strrr = str1.toCharArray();
			char[] strrs = str2.toCharArray();

			Arrays.sort(strrr);
			Arrays.sort(strrs);

			if (Arrays.equals(strrr, strrs)) {

				System.out.println("anagrams");

			}

			else

			{

				System.out.println("not an anagram");
			}

		}

	}

}
