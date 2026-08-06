class Solution {

    public int smallestNumber(int n, int t) {
        int k = n;
        int prod =1;
        while(true)
        {
            int p = k;
            prod =1;
            
            while(p>0)
            {
                prod*=(p%10);
                p/=10;
            }
            if(prod%t==0)
            return k;
            k++;
        }
        
       
        
    }
}