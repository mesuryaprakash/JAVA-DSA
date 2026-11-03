class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int s = 0;
        int f = 0;

        if(n == 0 || n == 1) return n;
        int count = 1;

        while(f < n){
            if(nums[s] == nums[f]){
                f++;
                continue;
            } 

            nums[s+1] = nums[f];
            s++;
            f++;
            count++;
        }

        return count;
        
    }
}