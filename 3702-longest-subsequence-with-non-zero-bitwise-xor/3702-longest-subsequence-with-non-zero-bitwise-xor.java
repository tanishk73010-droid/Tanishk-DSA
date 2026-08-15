class Solution {
    public int longestSubsequence(int[] nums) {
        int xor =0;
        int  count =nums.length;
        for(int ar : nums)
            xor^=ar;
            if(xor!=0)
            return count;
            else 
            {
                for(int arr:nums)
                {
                    if(arr!=0)
                    return count-1;
                }
                return 0;
            }
        
    }
}