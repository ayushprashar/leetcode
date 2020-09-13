class MaxSumSubArray {
    public int maxSubArray(int[] nums) {
        int flag = Integer.MIN_VALUE;
        for(int i = 0; i <  nums.length; i++) {
            if(nums[i]> flag)
                flag = nums[i];
        }
        if(flag < 0)
            return flag;
        int sum = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(result < sum)
                result = sum;
            if(sum < 0)
                sum = 0;
        }
        return result;
        
    }  //     private int maxSumSubarray(int[] nums, int start, int end) {
//         int flag = Integer.MIN_VALUE;
//         for(int i = start; i <= end; i++) {
//             if(nums[i]>flag)
//                 flag = nums[i];
//         }
//         if(flag<0)
//             return flag;
//         if(start == end)
//             return nums[start];
//         int mid = start + (end - start)/2;
//         int leftMss = maxSumSubarray(nums, 0, mid);
//         int rightMss = maxSumSubarray(nums, mid + 1, end);
//         int leftSum = Integer.MIN_VALUE;
//         int rightSum = Integer.MIN_VALUE;
//         int sum = 0;
//         for(int i = mid; i >= start; i--) {
//             sum += nums[i];
//             if(leftSum < sum)
//                 leftSum = sum;
//         }
        
//         sum = 0;
//         for(int i = mid + 1; i <=end; i++) {
//             sum += nums[i];
//             if(sum > rightSum )
//                 rightSum = sum;
//         }
        
//         int midSum = leftSum + rightSum;
        
//         int result = leftMss > rightMss ? leftMss : rightMss;
//         result = result > midSum ? result : midSum;
//         return result;
//
}