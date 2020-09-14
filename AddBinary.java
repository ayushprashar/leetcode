class AddBinary {
    public String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while(i>=0 && j>=0) {
            if(carry == 0) {
                if(a.charAt(i) == '0') {
                    if(b.charAt(j) == '0')
                        sb.append('0');
                    else sb.append('1');
                    j--;
                } else {
                    if(b.charAt(j) == '0')
                        sb.append(1);
                    else {
                        carry = 1;
                        sb.append('0');
                    }
                    j--;
                }
                i--;
            } else {
                if(a.charAt(i) == '0') {
                    if(b.charAt(j) == '0') {
                        sb.append('1');
                        carry = 0;
                    } else sb.append('0');
                    j--;
                } else {
                    if(b.charAt(j) == '0')
                        sb.append('0');
                    else
                        sb.append('1');
                    j--;
                }
                i--;
            }
        }
        
        if( i == -1 && j == -1) {
            if(carry == 1)
                sb.append('1');
            sb = sb.reverse();
            return sb.toString();
        }
        
        if(i == -1) {
            for(; j>= 0; j--) {
                if(carry == 0)
                    sb.append(b.charAt(j));
                else {
                    if(b.charAt(j) == '0'){
                        sb.append('1');
                        carry = 0;
                    } else 
                        sb.append('0');
                }
            }
            
        } else {
            for(; i>=0; i--) {
                if(carry == 0){
                    sb.append(a.charAt(i));
                } else {
                    if(a.charAt(i) == '0') {
                        sb.append('1');
                        carry = 0;
                    } else
                        sb.append('0');
                }
            }
        }
        if(carry == 1)
            sb.append('1');
        sb = sb.reverse();
        return sb.toString();
    }
}