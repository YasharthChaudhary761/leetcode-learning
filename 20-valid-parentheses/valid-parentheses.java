class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        s.toCharArray();
        for(int i=0;i<s.length();i++){
           //if(stk.isEmpty()) return false;
            if(stk.isEmpty() || s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' )
            {
                stk.push(s.charAt(i));
            }

            if(s.charAt(i)==')')
            {
                if(stk.peek()=='(') stk.pop();
                else return false;
            }


            if(s.charAt(i)=='}')
            {
                if(stk.peek()=='{') stk.pop();
                else return false;
            }

            if(s.charAt(i)==']')
            {
                if(stk.peek()=='[') stk.pop();
                else return false;
            }
        }
        if(stk.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
}