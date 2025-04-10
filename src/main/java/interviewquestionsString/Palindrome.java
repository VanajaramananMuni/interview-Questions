package interviewquestionsString;

public class Palindrome {

	public static void main(String[] args) {

		String pali = "Madam";

		String reversed = "";

		String[] rev = pali.toLowerCase().split("");

		for (int i = rev.length - 1; i >= 0; i--) {

			reversed += rev[i];

		}

		System.out.println(reversed);

		if (pali.equalsIgnoreCase(reversed)) {

			System.out.println("true");
		}

		else

		{

			System.out.println("false");

		}

		// 2nd method pali or not

		StringBuilder sb = new StringBuilder(pali);

		System.out.println(sb.reverse());

		String sss = sb.reverse().toString();

		if (pali.equalsIgnoreCase(sss)) {

			System.out.println("true");

		} else {

			System.out.println("falese");
		}

	}

}
