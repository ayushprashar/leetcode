class ExcelSheetCol {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for(int i = 1; i<=chars.length; i++) {
            int pow =(int) Math.pow(26, chars.length - i);
            int val = getIntValue(chars[i-1]);
            result =result + pow * val;
        }
        return result;
    }
    private int getIntValue(char ch) {
        if(ch >='a' && ch <= 'z')
            return ch - 96;
        else if(ch >= 'A' && ch <= 'Z')
            return ch - 64;
        else return -1;
    }
}