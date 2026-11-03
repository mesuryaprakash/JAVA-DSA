class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if(n <= 1) return n;

        int s = 0;
        int f = 1;
        boolean flag = true;
        int count = 1;


        while(f < n){
            if(nums[s] == nums[f]){
                if(flag){
                    if(f == n-1){
                        System.out.print(nums[s+1] + " " + nums[f]);
                        nums[s+1] = nums[f];
                        return ++count;
                    }
                    nums[s+1] = nums[f];
                    s++;
                    f++;
                    flag = false;
                    count++;
                    continue;
                }
                f++;
                continue;
            }
            nums[s+1] = nums[f];
            s++;
            f++;
            count++;
            flag = true;
        }

        return count;
        
    }
}