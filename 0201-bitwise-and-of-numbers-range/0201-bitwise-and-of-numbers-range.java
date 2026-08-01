class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans =0;
        for(int i =0;i<32;i++)
        {
              if(right==left)
              return left<<ans;
              else
              {
               right = right>>1;
              left =  left>>1;
                ans++;
              }

            
        }
          
        
        return 0;
    }
}