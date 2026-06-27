import java.util.ArrayList;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> occurrenceIndices = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                occurrenceIndices.add(i);
            }
        }
        
        int[] arr = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            
            if (query > occurrenceIndices.size()) {
                arr[i] = -1;
            } else {
                arr[i] = occurrenceIndices.get(query - 1);
            }
        }
        
        return arr;
    }
}