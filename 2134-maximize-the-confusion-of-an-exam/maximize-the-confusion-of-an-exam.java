class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int max=0;
        int l=0, r=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(r<n)
        {
            char ch=answerKey.charAt(r);
            map.put(ch, map.getOrDefault(ch,0)+1);
            while(Math.min(map.getOrDefault('T', 0), map.getOrDefault('F', 0)) > k)
            {
                map.put(answerKey.charAt(l), map.get(answerKey.charAt(l)) - 1);
                l++;
            }
            max=Math.max(max, r-l+1);
            r++;
        }
        return max;
        
    }
}