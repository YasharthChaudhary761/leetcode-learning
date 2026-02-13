class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char []charray=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char temp=charray[0];
            for(int j=1;j<s.length();j++)
            {
                charray[j-1]=charray[j];
            }
            charray[s.length()-1]=temp;
            String str=new String(charray);
            if(str.equals(goal)) return true;
        }
        return false;
    }
}