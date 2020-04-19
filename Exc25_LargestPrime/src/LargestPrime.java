public class LargestPrime {
	public static int getLargestPrime(int number) {
		int maxPrime = -1;
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				boolean isPrime = true;
				for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
					if (number % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime) {
					maxPrime = i;
				}
			}
		}
		return maxPrime;
	}
}
