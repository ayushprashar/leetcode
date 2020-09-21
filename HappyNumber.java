class HappyNumber {
    public boolean isHappy(int n) {
        return isHappyInner(n, new HashSet<Integer>());
    }
    private boolean isHappyInner(int n, Set<Integer> set) {
        int sum = squareDigitSum(n);
        if(sum == 1)
            return true;
        else if(set.contains(sum))
            return false;
        else {
          set.add(sum);  
          return isHappyInner(sum, set);  
        } 
    }
    private int squareDigitSum(int n) {
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem;
            n /= 10;
        }
        return sum;
    }
}