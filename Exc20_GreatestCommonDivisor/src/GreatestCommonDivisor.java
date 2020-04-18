public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int x, int y) {
		if ((x < 10) || (y < 10)) {
			return -1;
		}
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		while (min != 0) {
			int temp = max;
			max = min;
			min = temp % min;
		}
		return max;
	}
}
