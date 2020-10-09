public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        n1 = (int) (n1 * 1000);
        n2 = (int) (n2 * 1000);
        return (n1 == n2);
    }
}
