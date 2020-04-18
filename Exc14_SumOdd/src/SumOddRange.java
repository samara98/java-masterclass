public class SumOddRange {
	public static boolean isOdd(int number) {
		if ((number > 0) && (number % 2 == 1)) {
			return true;
		}
		return false;
	}
	public static int sumOdd(int start, int end) {
		if ((end < start) || (start < 0) || (end < 0)) {
			return -1;
		}
		int result = 0;
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				result += i;
			}
		}
		return result;
	}
}
