package interviewquestionsString;

public class LargestwordinSentence {

	public static void main(String[] args) {

		String s = "vanja dont believe vanajramanana ";

		String[] splited = s.split(" ");

		String largestword = "";

		for (String iter : splited) {

			if (iter.length() > largestword.length()) {

				largestword = iter;

			}

		}

		System.out.println(largestword);
	}

}
