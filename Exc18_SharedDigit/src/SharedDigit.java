public class SharedDigit {
	public static boolean hasSharedDigit(int number1, int number2) {
		if ((number1 >= 10) && (number1 <= 99) && (number2 >= 10) && (number2 <= 99)) {
			while (number1 != 0) {
				int temp = number2;
				while (temp != 0) {
					if (number1 % 10 == temp % 10) {
						return true;
					}
					temp /= 10;
				}
				number1 /= 10;
			}
		}
		return false;
	}
}