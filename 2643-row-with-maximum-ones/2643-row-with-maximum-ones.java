class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max =0;
        int ind = 0;
    for(int i=0;i<mat.length;i++)
    {
        int count=0;
        for(int j=0;j<mat[i].length;j++)
            count+=mat[i][j]&1;
           ind = max<count?i:ind;
            max = Math.max(count,max);
              }
    return new int[]{ind,max};
    }
}