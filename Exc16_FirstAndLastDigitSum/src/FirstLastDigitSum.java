public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		if (number >= 0) {
			int first = 0, last = number % 10;
			while (number != 0) {
				first = number % 10;
				number /= 10;
			}
			return (first + last);
		}
		return -1;
	}
}
