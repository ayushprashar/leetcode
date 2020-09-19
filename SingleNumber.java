class SingleNumber {
    public int singleNumber(int[] nums) {
        int numsLen = nums.length;
        if(numsLen == 1)
            return nums[0];
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0; i < numsLen; i++) {
            if(numSet.contains(nums[i]))
                numSet.remove(nums[i]);
            else
                numSet.add(nums[i]);
        }
        return numSet.iterator().next();
    }
}