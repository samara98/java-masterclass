public class MegaBytesConverter {
		public static void printMegaBytesAndKiloBytes(int kiloBytes) {
			if (kiloBytes < 0) {
				System.out.println("Invalid Value");
			} else {
				int megaBytes = kiloBytes / 1024;
				int remainingKiloBytes = kiloBytes % 1024;
				System.out.format("%d KB = %d MB and %d KB\n", kiloBytes, megaBytes, remainingKiloBytes);
			}
		}
	}
