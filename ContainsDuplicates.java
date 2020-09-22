class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++)
            if(nums[i] == nums[i + 1])
                return true;
        return false;
    }

    /*public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n))
                return true;
            else
                set.add(n);
        }
        return false;
    }*/
}