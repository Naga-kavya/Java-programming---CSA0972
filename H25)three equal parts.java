class Solution {
    public int[] threeEqualParts(int[] arr) {
        int n = arr.length;
        int[] result = new int[] {-1, -1};
        int onesCount = 0;
        for (int num : arr) {
            if (num == 1) {
                onesCount++;
            }
        }
        if (onesCount == 0) {
            return new int[] {0, n - 1};
        }
        if (onesCount % 3 != 0) {
            return result;
        }
        int k = onesCount / 3;
        int i = 0;
        int onesFound = 0;
        while (onesFound < k) {
            if (arr[i++] == 1) {
                onesFound++;
            }
        }
        int j = n - 1;
        onesFound = 0;
        while (onesFound < k) {
            if (arr[j--] == 1) {
                onesFound++;
            }
        }
        while (i <= j) {
            if (arr[i++] != arr[j--]) {
                return result;
            }
        }
        result[0] = j + k + 1;
        result[1] = i - k - 1;
        return result;
    }
}
