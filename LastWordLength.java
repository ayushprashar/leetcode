class lastWordLength {
    public int lengthOfLastWord(String s) {
        if(s == null || s.equals(""))
            return 0;
        int length = s.length();
        int lastChar = length - 1;
        while(lastChar >= 0 && Character.isWhitespace(s.charAt(lastChar)))
            lastChar--;
        if(lastChar == -1)
            return 0;
        int i = lastChar - 1;
        for(; i >= 0;i--) {
            if(Character.isWhitespace(s.charAt(i)))
                return lastChar - i;
        }
        
        if(i == -1)
            return lastChar - i;
        return 0;
        
    }
//         public int lengthOfLastWord(String s) {
//         if(s == null || s.length() == 0)
//             return 0;
//         s = s.trim();
//         String[] bitsOfString = s.split(" ");
//         return bitsOfString[bitsOfString.length - 1].length();
        
//     }

}