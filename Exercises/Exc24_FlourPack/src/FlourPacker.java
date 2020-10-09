public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        for (int i = 1; i <= bigCount; i++) {
            int temp = goal - (5 * i);
            if (temp < 0) {
                return false;
            }
            if (temp == 0) {
                return true;
            }
            for (int j = 1; j <= smallCount; j++) {
                temp -= 1;
                if (temp == 0) {
                    return true;
                }
            }
        }
        for (int i = 1; i <= smallCount; i++) {
            goal -= 1;
            if (goal == 0) {
                return true;
            }
        }
        return false;
    }
}
