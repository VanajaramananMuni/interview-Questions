package numberbasedquestions;

public class PaliorNot {

	public static void main(String[] args) {

		String name = "ramanan";

		String sb = new StringBuilder(name).reverse().toString();

		System.out.println(sb);

		if (name.equalsIgnoreCase(sb)) {
			System.out.println("yes it is palindrome");

		}

		else {

			System.out.println("it is not palidnrom");
		}

		// 2nd method in by number

		int number = 121;
		
		int original =number;

		int reversed = 0;

		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;

		}
		
		System.out.println(reversed);
		
		if(original == reversed) {
			
			System.out.println("pali");
		}
		
		else {
			
		System.out.println("not pali");
		}

	}

}
