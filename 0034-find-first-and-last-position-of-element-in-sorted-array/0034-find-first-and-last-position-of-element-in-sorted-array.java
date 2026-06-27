class Solution {
    public int[] searchRange(int[] nums, int target) {
    // Edge case: Empty array
    if (nums == null || nums.length == 0) {
        return new int[]{-1, -1};
    }

    int low = 0;
    int high = nums.length;
    int str = -1;
    int end = -1;

    // 1. Lower Bound Loop
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] >= target) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    str = low; // Found the lower bound insertion index

    // VALIDATION: Check if the target actually exists at this index
    if (str == nums.length || nums[str] != target) {
        return new int[]{-1, -1}; // Target not found
    }

    // Reset pointers for upper bound
    low = 0;
    high = nums.length;

    // 2. Upper Bound Loop
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] > target) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    // 'low' is now the first index > target, so the last occurrence is low - 1
    end = low - 1; 

    return new int[]{str, end};
}
}