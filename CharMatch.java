class CharMatch {
    public boolean isValid(String s) {
        Stack<Character> matchStack = new Stack<>();
        char curr;
        char matchChar;
        for(int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if(curr == '[' || curr == '(' || curr == '{' ) {
                matchStack.push(curr);
            } else {
                if(matchStack.isEmpty())
                    return false;
                else {
                    matchChar = matchStack.pop();
                    if(matchChar == '('  && curr == ')')
                        continue;
                    else if(matchChar == '{' && curr == '}')
                        continue;
                    else if(matchChar == '[' && curr == ']')
                        continue;
                    else 
                        return false;
                }
            }
        }
        
        matchStack.isEmpty();
    }
}