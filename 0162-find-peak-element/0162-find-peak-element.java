class Solution {
    public int findPeakElement(int[] nums) {
        int str=0;
        int end = nums.length-1;
        
        while(str<end)
        {
            int  mid = str+(end-str)/2;
            int k = nums[mid];
            if(k<nums[mid+1])
            str=mid+1;
            else
            end=mid;
        }
        return str;
    }
}