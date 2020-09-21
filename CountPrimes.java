class CountPrimes {
    public int countPrimes(int n) {
        if(n <=1)
            return 0;
        boolean[] primeCount = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            primeCount[i] = true;
        }
        
        for(int i = 2; i*i < n; i++) {
            if(primeCount[i]){
                for(int j = 2; j * i < n; j++) {
                    if(primeCount[j*i])
                        primeCount[j*i] = false;
                }
            }
        }
        
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(primeCount[i])
                count++;
        }
        return count;
    }
}