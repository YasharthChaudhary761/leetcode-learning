class Solution {
    private Boolean[] t;
    int n;
    public boolean solve(String s, int idx, List<String> wordDict)
    {
        if(idx==n) return true;
        if(t[idx]!=null) return t[idx];
        for(int len=idx+1; len<=n; len++)
        {
            String split=s.substring(idx,len);
            if(wordDict.contains(split) && solve(s,len,wordDict)) return t[idx]=true;
        }
        return t[idx]=false;
    }



    public boolean wordBreak(String s, List<String> wordDict) {
        n=s.length();
        t=new Boolean[s.length()];
        return solve(s,0,wordDict);
    }
}