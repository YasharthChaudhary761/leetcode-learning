class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0;
        int maxFreq=0;
        int r=0, l=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(r<s.length())
        {
            map.put(s.charAt(r),  map.getOrDefault(s.charAt(r), 0) + 1); ///ye value increment krr rha hai
            maxFreq=Math.max(maxFreq,  map.get(s.charAt(r)));

            while((r-l+1)-maxFreq > k)
            {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                maxFreq=0;

                for(int count: map.values())
                {
                    maxFreq=Math.max(maxFreq, count);
                }
                l=l+1;
            }
            if((r-l+1)-maxFreq<=k)
            {
                maxLen=Math.max(maxLen, r-l+1);
            }
            r++;
        }
        
        return maxLen;
    }
}

//         int max=0;
//         int n=s.length();
//         int l=0, r=0;

//         while(r<n)
//         {                                   Isme thodi si galti hai
//             char ch=s.charAt(r);
//             int curr=0;
//             if(ch != s.charAt(l) && k>0)
//             {
//                 curr=r-l+1;
//                 max=Math.max(max, curr);
//                 k--;
//             }
//             else if(s.charAt(l)==s.charAt(r))
//             {
//                 curr=r-l+1;
//                 max=Math.max(max, curr);
//             }
//             else
//             {
//                 l=l+1;
//             }
//             r++;
//         }
//         return max;