class PrefixList {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        else if(strs.length == 1)
            return strs[0];
        int minLength = getMinLength(strs);
        minLength = (minLength > 0) ? minLength : 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < minLength; i++) {
            boolean isMatching = true;
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != strs[j-1].charAt(i))
                    isMatching = false;
            }
            
            if(isMatching) {
                sb.append(strs[0]
                          .charAt(i));
            } else return sb.toString();
        }
        return sb.toString();
    }
    
    private int getMinLength(String[] strs) {
        
        int minLength = Integer.MAX_VALUE;
        
        for(int i = 0; i < strs.length; i++) {
            
            int currLength = strs[i].length();
            
            if(currLength < minLength)
                minLength = currLength;
        }
        
        return minLength;
    }
}