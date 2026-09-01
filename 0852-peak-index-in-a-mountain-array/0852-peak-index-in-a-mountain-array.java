class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int mid = i + (j - i) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                i = mid + 1; // Move past mid
            } else {
                j = mid;     // Keep mid as a potential peak
            }
        }
        
        return i; // i and j meet at the peak index
    }
}
