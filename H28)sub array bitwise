import java.util.HashSet;
import java.util.Set;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for (int num : arr) {
            Set<Integer> cur2 = new HashSet<>();
            cur2.add(num);
            for (int x : cur) {
                cur2.add(x | num);
            }
            cur = cur2;
            ans.addAll(cur);
        }
        return ans.size();
    }
}
