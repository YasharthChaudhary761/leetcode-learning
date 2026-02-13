class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        char []start=strs[0].toCharArray();
        char []end=strs[strs.length-1].toCharArray();
        for(int i=0;i<start.length;i++)
        {
            if(start[i]!=end[i]) break;
            ans.append(start[i]);
        }
        return ans.toString();
    }
}