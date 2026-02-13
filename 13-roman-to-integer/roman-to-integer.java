class Solution {
    public int romanToInt(String s) {
        int []arr=new int[128];
        int ans=0;
        arr['I']=1;
        arr['V']=5;
        arr['X']=10;
        arr['L']=50;
        arr['C']=100;
        arr['D']=500;
        arr['M']=1000;
       for(int i=0;i+1<s.length();++i)
       {
        if(arr[s.charAt(i)]<arr[s.charAt(i+1)])
        {
            ans-=arr[s.charAt(i)];
        }
        else
        {
            ans+=arr[s.charAt(i)];
        }
       }
        return ans+arr[s.charAt(s.length()-1)];
    }
}