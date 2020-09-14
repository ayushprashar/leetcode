class PlusOne {
    public int[] plusOne(int[] digits) {
        int arrLen = digits.length;
        if(digits[arrLen-1] != 9) {
            digits[arrLen - 1] += 1;
            return digits;
        } else {
            int i = arrLen - 1;
            while(i>=0) {
                if(digits[i] == 9) {
                    digits[i] = 0;
                    i--;
                } else {
                    digits[i] += 1;
                    return digits;
                }
            }
            
        }
        if(digits[0] == 0) {
            int[] resultArray = new int[arrLen + 1];
            resultArray[0] = 1;
            return resultArray;
        }
        return new int[0];
    }
}