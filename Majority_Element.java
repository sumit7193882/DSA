class Solution {
    public int majorityElement(int[] nums) {
        // Moore's Voting Algorithm
        int count = 0;
        int prev = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                prev = nums[i]; 
                count = 1;        
            } else if (nums[i] == prev) {
                count++;  
            } else {
                count--; 
            }
        }

       
        count = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == prev) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return prev;
        }

        return -1;
    }
}
