class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length(); ++i)
        {
            if(stk.isEmpty() || stk.peek()!=s.charAt(i))
            {
                stk.push(s.charAt(i));
            }
            else if(stk.peek()==s.charAt(i))
            {
                stk.pop();
            }
        }
        

         StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        return sb.reverse().toString();
    }
}