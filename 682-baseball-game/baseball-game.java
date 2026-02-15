class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> stk=new Stack<>();
        int ans=0;
        for(int i=0;i<n;i++)
        {
           String s=operations[i];
           if(s.equals("C")) stk.pop();
           else if(s.equals("D")) stk.push(2*stk.peek());
           else if(s.equals("+"))
           {
            int top1=stk.pop();
            int top2=stk.peek();
            int sum=top1+top2;
            stk.push(top1);
            stk.push(sum);
           }
           else stk.push(Integer.parseInt(s));
        }

        while(!stk.isEmpty())
        {
            ans=ans+stk.pop();
        }   
        return ans;
    }
}