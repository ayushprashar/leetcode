class BankRobber {
    //Highest possible amount after last element of num array could either be sum of highest amount till element
    // n - 2 and the money at n, or it could plainly be the highest amount till n - 1;
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }
        return dp[dp.length - 1];
    }
}