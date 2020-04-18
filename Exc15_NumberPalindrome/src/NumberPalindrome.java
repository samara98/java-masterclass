public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		int reverse = 0, tempNumber = number;
		while (tempNumber != 0) {
			reverse = (reverse * 10) + (tempNumber % 10);
			tempNumber /= 10;
		}
		return reverse == number;
	}
}
