class RemoveValFromArray {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while(i < n) {
            if(nums[i] == val){
                nums[i] = nums[--n];
            } else i++;
        }
        return n;
    }
}