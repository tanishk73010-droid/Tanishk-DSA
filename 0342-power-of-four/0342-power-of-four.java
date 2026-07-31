class Solution {
    public boolean isPowerOfFour(int n) {
        int count=0;
        int fav = n;
        if(n==1)
        count+=1;
        while(fav!=0 && ( (n&1)==0 && n>0))
        {
           fav= fav>>1;
           count+=1;
        }
        return n>0 && ((n&(n-1))==0 && (count&1)==1);

        
    }
}