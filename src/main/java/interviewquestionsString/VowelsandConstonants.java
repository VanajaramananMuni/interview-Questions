package interviewquestionsString;

public class VowelsandConstonants {

	public static void main(String[] args) {

		String vc = "Vanajaramanan VM";
		int vowesl = 0, consonants = 0;
		for (int i = vc.length() - 1; i >= 0; i--) {

			char cc = vc.charAt(i);

			if (cc >= 'a' && cc <= 'z') {

				if (cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u') {

					vowesl++;

				} else

				{
					consonants++;

				}

			}
		}
		System.out.println(vowesl + "" + "vowels count");
		System.out.println(consonants + "" + "consonant counts");
	}
}
