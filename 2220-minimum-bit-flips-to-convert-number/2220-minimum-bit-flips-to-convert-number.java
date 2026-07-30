class Solution {
    public int minBitFlips(int start, int goal) {
        int bit = start^goal;
        int count =0;
        while(bit>0)
        {
            bit = bit&(bit-1);
            count+=1;

        }
        return count;
    }
}