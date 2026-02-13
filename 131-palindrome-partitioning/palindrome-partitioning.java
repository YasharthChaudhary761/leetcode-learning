class Solution {
    int n;
    public boolean isPalindrome(String s, int l, int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public void solve(int idx, String s, ArrayList<String> curr,ArrayList<List<String>> result)
    {
        if(idx==n)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx; i<s.length(); i++)
        {
            if(isPalindrome(s,idx,i))
            {
                curr.add(s.substring(idx,i+1));
                solve(i+1, s, curr, result);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        n=s.length();
        ArrayList<List<String>> result=new ArrayList<>();
        ArrayList<String> curr=new ArrayList<>();
        solve(0,s,curr,result);
        return result;
    }
}