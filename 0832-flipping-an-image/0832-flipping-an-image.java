class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i =0;i<image.length;i++)
        {
             for(int j =0;j<=image.length/2 &&(j<=(n-j-1));j++)
             {
                if(j==(n-j-1))
                {
                    image[i][j]^=1;
                    continue;
                }
                 int temp = image[i][j];
                image[i][j] = image[i][n-j-1]^1;
                image[i][n-j-1]=temp^1;

             }
        
        }
        return image;
    }
}