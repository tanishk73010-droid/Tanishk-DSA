class Solution {
    public int findMin(int[] nums) {
        
        int min=nums[0];
        int str=0;
        int end = nums.length-1;

        while(str<=end)
        {
            int mid = str+(end-str)/2;
            min = Math.min(min,nums[mid]);

            if(nums[mid]<nums[end])
            end=mid-1;
            else
            str=mid+1;
        }
        return min;
        
    }
}