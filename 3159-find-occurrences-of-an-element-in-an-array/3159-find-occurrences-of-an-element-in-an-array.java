class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count=0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0;i <nums.length;i++)
        {
            if(nums[i]==x){
            count++;
            map.put(count,i);
            } }
int [] arr = new int[queries.length];
            for(int i=0;i<queries.length;i++)
            {
                if(queries[i]>count)
                arr[i]=-1;
                else
                arr[i]=map.get(queries[i]);


            }

return arr;
        
    }
}