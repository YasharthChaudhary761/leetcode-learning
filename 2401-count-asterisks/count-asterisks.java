class Solution {
    public int countAsterisks(String s) {
        Stack<Character> stk=new Stack<>();
        boolean flag=false;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            stk.push(s.charAt(i));
        }

        while(!stk.isEmpty())
        {
            char ch=stk.peek();
            stk.pop();
            if(ch=='|') flag=!flag;
            else if(ch=='*' && !flag)
            {
                ans++;
            }
        }
        return ans;
    }
}




//ye pta nii sahi hai ya galat
/**int count=0;
        Stack<Character> stk=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='|')
            {
                for(int j=i;j<=s.length()-1 || s.charAt(i)=='|'; j++)
                {
                    continue;
                }
            }
            stk.push(s.charAt(i));
            i++;
        }

        while(!stk.isEmpty())
        {
            if(stk.peek()=='*')
            {
                count++;
                stk.pop();
            }
            else stk.pop();
        }
        return count; */