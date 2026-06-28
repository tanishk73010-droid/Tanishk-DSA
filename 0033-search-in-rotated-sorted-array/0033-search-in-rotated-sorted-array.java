class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        
        int str = 0;
        int end = nums.length - 1;
        
        while (str <= end) {
            int mid = str + (end - str) / 2;
            
            // If target is found, return its index
            if (nums[mid] == target) {
                return mid;
            }
            
            // Check if the left half is normally sorted
            if (nums[str] <= nums[mid]) {
                // Check if the target lies within the sorted left half
                if (target >= nums[str] && target < nums[mid]) {
                    end = mid - 1; // Search left
                } else {
                    str = mid + 1; // Search right
                }
            } 
            // Otherwise, the right half must be normally sorted
            else {
                // Check if the target lies within the sorted right half
                if (target > nums[mid] && target <= nums[end]) {
                    str = mid + 1; // Search right
                } else {
                    end = mid - 1; // Search left
                }
            }
        }
        
        // Target not found
        return -1;
    }
}