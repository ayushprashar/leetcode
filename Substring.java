class Substring {
    public int strStr(String haystack, String needle) {
        
        if(needle.equals("")
          || needle == null)
            return 0;
        if(haystack == null 
          || haystack.length() == 0)
            return -1;
        char firstChar = needle.charAt(0);
        for(int i = 0; i<haystack.length(); i++) {
            if(haystack.charAt(i) == firstChar
              && i + needle.length()<= haystack.length() 
              && haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}