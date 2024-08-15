package easy;

import java.util.HashMap;
import java.util.Map;

public class KMP {
    static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        long result = calculateF(39);
        System.out.println(result);
    }


    public static long calculateF(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 3) {
            return 3;
        }

        long[] f = new long[n + 1];
        f[0] = 1;
        f[3] = 3;

        for (int i = 4; i <= n; i++) {
            f[i] = 5 * f[i - 1] + 2 * f[i - 2];
        }

        return f[n];
    }
}
