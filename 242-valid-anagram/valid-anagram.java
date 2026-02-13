class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char []ss=s.toCharArray();
        char []tt=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        String s1=new String(ss);
        String s2=new String(tt);
        if(s1.equals(s2)) return true;
        return false;
    }
}