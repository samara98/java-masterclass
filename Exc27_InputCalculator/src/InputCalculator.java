import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, count = 0;
		while (true) {
			boolean hasNextInt = scanner.hasNextInt();
			if (!hasNextInt) {
				break;
			}
			int inp = scanner.nextInt();
			sum += inp;
			count++;
		}
		double avg = Math.round((double)sum / (double) count);
		System.out.println(String.format("SUM = %d AVG = %.0f", sum, avg));
		scanner.close();
	}
}
