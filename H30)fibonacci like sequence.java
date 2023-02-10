import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciLikeSequence {
    public static List<Integer> splitIntoFibonacci(String num) {
        List<Integer> res = new ArrayList<>();
        if (num == null || num.length() < 3) return res;
        backtrack(num, res, 0);
        return res;
    }

    private static boolean backtrack(String num, List<Integer> res, int start) {
        if (start == num.length() && res.size() >= 3) return true;
        for (int i = start; i < num.length(); i++) {
            if (num.charAt(start) == '0' && i > start) break;
            long cur = Long.parseLong(num.substring(start, i + 1));
            if (cur > Integer.MAX_VALUE) break;
            int size = res.size();
            if (size >= 2 && cur > res.get(size - 1) + res.get(size - 2)) break;
            if (size <= 1 || cur == res.get(size - 1) + res.get(size - 2)) {
                res.add((int) cur);
                if (backtrack(num, res, i + 1)) return true;
                res.remove(res.size() - 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String num = "1101111";
        List<Integer> res = splitIntoFibonacci(num);
        System.out.println(res);
    }
}
