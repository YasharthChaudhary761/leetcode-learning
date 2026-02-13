class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []idx1=new int[256];
        int []idx2=new int[256];
        for(int i=0;i<s.length();i++)
        {
            if(idx1[s.charAt(i)]!=idx2[t.charAt(i)]) return false;
            idx1[s.charAt(i)]=i+1;
            idx2[t.charAt(i)]=i+1;
        }
        return true;
    }
}