class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0)
            return new int[2];
        for(int i = 0, j = numbers.length - 1; i < j;) {
            int tempSum = numbers[i] + numbers[j];
            if( tempSum == target)
                return new int[] {i + 1, j + 1};
            else if(tempSum > target)
                j--;
            else
                i++;
        }
        return new int[2];
    }
}