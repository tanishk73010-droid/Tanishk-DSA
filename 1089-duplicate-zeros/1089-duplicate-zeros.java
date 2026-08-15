class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ar = new int[arr.length];
        int j = 0;
        
        // Loop through the entire original array
        for (int i = 0; i < arr.length; i++) {
            // Safety check: stop if our new array buffer is completely full
            if (j >= ar.length) {
                break;
            }
            
            if (arr[i] == 0) {
                ar[j] = 0; // Write first zero
                j++;
                
                // Write second zero ONLY if there is room left in the array
                if (j < ar.length) {
                    ar[j] = 0;
                    j++;
                }
            } else {
                ar[j] = arr[i]; // Write non-zero number
                j++;
            }
        }
        
        // Copy EVERYTHING back into the original array (i < arr.length)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ar[i];
        }
    }
}
