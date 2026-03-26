class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character, Integer> map=new HashMap<>();
        int max=0;
        int l=0, r=0;
        while(r<n)
        {
            int len=0;
            if(map.containsKey(s.charAt(r)))
            {
                if(map.get(s.charAt(r))>=l)
                {
                    l=map.get(s.charAt(r))+1;
                }
            }
            len=r-l+1;
            max=Math.max(max, len);
            map.put(s.charAt(r),r);
            r++;
        }
        return max;
    }
}