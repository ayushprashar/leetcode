class Palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString().toLowerCase();
        int sLen = s.length();
        for(int i = 0, j = sLen - 1; i< sLen && j >= 0; i++, j--) {
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}