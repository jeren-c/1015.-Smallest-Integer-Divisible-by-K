class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int i = 1;
        for (int val = 1; val % k != 0; i++) {
            val %= k;
            val = val * 10 + 1;
        }
        return i;
    }
}
