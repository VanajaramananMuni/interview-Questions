package numberbasedquestions;

public class PrimeorNot {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

				System.out.println("it is prime");
				return;
			}

			else

			{

				System.out.println("it is not prime");
				
				return;
			}

		}

	}
}
