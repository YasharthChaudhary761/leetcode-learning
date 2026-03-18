class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();

        if(k==n) return "0";

        Stack<Character> stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch = num.charAt(i);
            while(!stk.isEmpty() && k > 0 && stk.peek() > ch){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
        }

        while(k>0){
            stk.pop();
            k--;
        }

        int size=stk.size();
        char[] arr=new char[size];
        for(int i=size-1; i>=0; i--)
        {
            arr[i]=stk.pop();
        }

        int i=0;
        while(i < size && arr[i]=='0')
        {
            i++;
        }

        if(i==size) return "0";

        String result = "";
        for(int j=i;j<size;j++)
        {
            result=result+arr[j];
        }
        return result;
    }
}