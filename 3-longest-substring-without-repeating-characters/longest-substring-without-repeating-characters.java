class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character, Integer> map=new HashMap<>();
        int max=0;
        int l=0, r=0;
        while(r<n)
        {
            int len=0;
            if(map.containsKey(s.charAt(r)))  // ye chewck kr rha hai ki map me rth index pe character hai ya mii..agar hai to next condition check hogi
            {
                if(map.get(s.charAt(r))>=l) // ye map me jo character store hua hai uska index check krr rha hai ki rth index l wale pointer se bada hai ya nii..agar bada hai to l wala pointer apne jagah se ek index aage badh jayega
                {
                    l=map.get(s.charAt(r))+1; // yaha pe actually me left pointer ek increment ho rha hai
                }
            }
            len=r-l+1; //yaha parr substring ki length calculate ho rhi hai 
            max=Math.max(max, len);
            map.put(s.charAt(r),r);
            r++;
        }
        return max;
    }
}