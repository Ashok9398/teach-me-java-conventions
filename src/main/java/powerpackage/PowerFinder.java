package powerpackage;

public class PowerFinder {
    public static int calculatePower(int base, int exponent) {
        int ans = 1;
        for (int counter = 0; counter<exponent; counter++) {
            ans *= base;
        }
        return ans;
    }
}
