

public class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            // Check if the i-th bit of n is set
            if ((n & (1 << i)) != 0) {
                // Set the corresponding bit from the left
                ans |= (1 << (31 - i));
            }
        }
        
        return ans;
    }
}