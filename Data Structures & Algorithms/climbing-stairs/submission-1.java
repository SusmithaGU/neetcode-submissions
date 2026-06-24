class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        cache[1] = 1;
        return helper(n, 0, cache);
    }

    public int helper(int n, int count, int[] cache) {
        if (n == 0) {
            return 1 + count;
        }
        if (n < 0)
            return count;

        int takeOneStep = cache[n - 1] != 0 ? cache[n - 1] : helper(n - 1, count, cache);
        int takeTwoSteps = n > 1 && cache[n - 2] != 0 ? cache[n - 2] : helper(n - 2, count, cache);
        cache[n] = takeOneStep + takeTwoSteps;
        return cache[n];
    }
}
