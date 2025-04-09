package interviewquestionsString;

public class Reversestring {

	public static void main(String[] args) {
		/*
		 * // here we are going to do string reverse in multiple methods..
		 * 
		 * 
		 * 1.
		 */

		String s = " Mathangi";

		String[] rev = s.split("");
		for (int i = rev.length - 1; i >= 0; i--) {

			System.out.print(rev[i]);
			System.out.println();
		}
//Second method by using stringbuilder methods.
		StringBuilder sb = new StringBuilder(s);
		StringBuilder ss = sb.reverse();
		System.out.println(ss);
		
		
		// third method using the reverse.

		String chareversed="";
	 for(int i=s.length()-1; i>=0; i--) {
		 
		 chareversed+=	 s.charAt(i);
	 }
	 
	 System.out.println(chareversed);

	}

}
