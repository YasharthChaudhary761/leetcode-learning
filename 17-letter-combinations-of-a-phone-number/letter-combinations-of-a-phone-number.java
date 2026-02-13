class Solution {
    public void solve(String digits, int idx, Map<Character, String> map, StringBuilder curr, List<String> result)
    {
        if(idx==digits.length())
        {
            result.add(curr.toString());
            return;
        }
        char digit=digits.charAt(idx);
        String letters=map.get(digit);
        for(char letter: letters.toCharArray())
        {
            curr.append(letter);
            solve(digits, idx+1, map, curr, result);
            curr.deleteCharAt(curr.length()-1);
        }
    }


    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0) return result;
        Map<Character, String> map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder curr=new StringBuilder();
        solve(digits, 0, map, curr, result);
        return result;
    }
}