class Solution {
    public boolean search(int[] nums, int target) {
        if(nums== null||nums.length==0)
        return false;
        int str=0;
        int end=nums.length-1;
         while(str<=end)
         {
            int mid =str+(end-str)/2;
            if(nums[mid]==target)
            return true;

            if(nums[str]==nums[mid]  &&  nums[end]==nums[mid])
            {
                str++;
                end--;
                continue;
            }

            else if(nums[str]<=nums[mid])
            {
                if(nums[str]<=target && nums[mid]>target)
                end=mid-1;
                else
                str=mid+1;
            }
            else
            {
                if(nums[end]>=target && nums[mid]<target)
                str=mid+1;
                else
                end=mid-1;
            }

         }
        return false;
    }
}