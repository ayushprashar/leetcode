class RomanInt {
    public int romanToInt(String s) {
        
        //Map<Character,Integer> valueMap = getValueMap();
        
        char current;
        char previous;
        int strLength = s.length();
        int result = 0;
        
        for(int i = strLength-1; i>=0; i--) {
            
            current = s.charAt(i);
            
            if(i+1<strLength) {
                previous = s.charAt(i+1);
            } 
            else 
                previous = '0';
            
            int currentValue = getIntVal(current);//valueMap.get(current);
            if(currentValue<getIntVal(previous)
               /*valueMap.get(previous)*/)
                result -= currentValue;
            else
                result += currentValue;
        }
        return result;
    }
    
    /*private Map<Character, Integer> getValueMap() {
        Map<Character, Integer> valueMap = new HashMap();
        valueMap.put('0',0);
        valueMap.put('I',1);
        valueMap.put('V',5);
        valueMap.put('X',10);
        valueMap.put('L',50);
        valueMap.put('C',100);
        valueMap.put('D',500);
        valueMap.put('M',1000);
        return valueMap;
    }*/
    
    private int getIntVal(char c) {
        switch(c) {
            case '0': return 0;
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}