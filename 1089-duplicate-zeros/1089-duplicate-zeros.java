class Solution {
    public void duplicateZeros(int[] arr) {
        int zerosToDuplicate = 0;
        int length = arr.length - 1;

        // Step 1: Count the zeros that can realistically fit
        for (int i = 0; i <= length - zerosToDuplicate; i++) {
            if (arr[i] == 0) {
                // Edge case: If a zero sits exactly at the boundary line,
                // we cannot duplicate it because the second zero falls out of bounds.
                if (i == length - zerosToDuplicate) {
                    arr[length] = 0; // Copy the single zero to the very end
                    length -= 1;     // Shrink the boundary
                    break;
                }
                zerosToDuplicate++;
            }
        }

        // Step 2: Start from the last valid element and copy backwards
        int lastValidIdx = length - zerosToDuplicate;
        
        for (int i = lastValidIdx; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zerosToDuplicate] = 0;
                zerosToDuplicate--;
                arr[i + zerosToDuplicate] = 0; // Duplicate zero
            } else {
                arr[i + zerosToDuplicate] = arr[i];
            }
        }
    }
}
