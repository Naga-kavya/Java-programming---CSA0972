import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i--];
            }
            if (j >= 0) {
                sum += arr2[j--];
            }
            res.add(sum & 1);
            carry = -(sum >> 1);
        }
        while (res.size() > 1 && res.get(res.size() - 1) == 0) {
            res.remove(res.size() - 1);
        }
        int[] result = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            result[k] = res.get(res.size() - k - 1);
        }
        return result;
    }
}
