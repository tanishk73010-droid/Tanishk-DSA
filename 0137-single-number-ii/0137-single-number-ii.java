class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int xor =0;
        for(int val : nums)
        {
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)<3)
            xor^=val;

        }

      return xor;  
    }
}