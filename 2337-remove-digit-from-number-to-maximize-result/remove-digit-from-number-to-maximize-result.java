class Solution {
    public String removeDigit(String number, char digit) {
        Stack<Character> stack = new Stack<>();
        int lastIdx = -1;
        boolean removed = false;


        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) lastIdx = i;
        }

  
        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);

      
            if (!removed && current == digit) {
               
                if (i + 1 < number.length() && number.charAt(i + 1) > digit) {
                    removed = true;
                    continue;
                } 
        
                else if (i == lastIdx) {
                    removed = true;
                    continue;
                }
            }
            stack.push(current);
        }


        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}