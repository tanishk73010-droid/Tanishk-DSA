class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        
        int first = 1;  // Ways to reach 1 step before
        int second = 1; // Ways to reach 2 steps before
        
        for (int i = 2; i <= n; i++) {
            int current = first + second;
            second = first;
            first = current;
        }
        
        return first;
    }
}