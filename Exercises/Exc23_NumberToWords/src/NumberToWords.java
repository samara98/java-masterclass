public class NumberToWords {
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int result = 1;
        number /= 10;
        while (number != 0) {
            result++;
            number /= 10;
        }
        return result;
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = (result * 10) + (number % 10);
            number /= 10;
        }
        return result;
    }

    public static void numberToWords(int number) {
        int digits = getDigitCount(number);
        int reversed = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= digits; i++) {
            switch (reversed % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;
        }
    }
}
