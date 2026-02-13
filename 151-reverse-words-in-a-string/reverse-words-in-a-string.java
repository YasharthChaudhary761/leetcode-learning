class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].length()==0)
            {
                continue;
            }
            if(ans.length()==0)
            {
                ans.append(arr[i]);
            }
            else
            {
                ans.append(" ");
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }
}