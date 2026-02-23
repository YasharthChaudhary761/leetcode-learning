class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        Stack<Long> stk=new Stack<>();
        stk.push((long) mass);
        for(int i=0;i<n;i++)
        {
            if(stk.peek()>=arr[i])
            {
                long top=stk.pop();
                top=top+arr[i];
                stk.push(top);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}