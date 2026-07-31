class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int m = 1<<(nums.length);
        List<List<Integer>>  ans = new ArrayList<>();
        for(int i =0;i<m;i++)
        { List <Integer> a = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if(((1<<j)&i)!=0)
                a.add(nums[j]);

            }
            ans.add(a);
        }
        return ans;
    }
}