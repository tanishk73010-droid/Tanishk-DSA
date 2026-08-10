class Solution {
    public int removeDuplicates(int[] nums) {
        int j=nums[0];
        int count =0;
        int ind=1;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==j)
             j=nums[i];
             else
             {
                count++;
                j=nums[i];
                nums[ind]=nums[i];
                ind++;
             }
            
        }
 return count+1;

        
    }
}