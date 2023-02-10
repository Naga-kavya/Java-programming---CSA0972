class NumArray {
    int[] nums;
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        tree = new int[n + 1];
        buildTree(nums);
    }

    private void buildTree(int[] nums) {
        for (int i = 0; i < n; i++) {
            updateTree(i, nums[i]);
        }
    }

    private void updateTree(int i, int val) {
        i++;
        while (i <= n) {
            tree[i] += val;
            i += i & (-i);
        }
    }

    public void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        updateTree(i, diff);
    }

    public int sumRange(int i, int j) {
        return sum(j) - sum(i - 1);
    }

    private int sum(int i) {
        i++;
        int res = 0;
        while (i > 0) {
            res += tree[i];
            i -= i & (-i);
        }
        return res;
    }
}
