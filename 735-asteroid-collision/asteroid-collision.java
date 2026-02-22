class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        int n=asteroids.length;
        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];

            if (current > 0) stk.push(current);
           
            else 
            {
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < -current)
                {
                    stk.pop(); 
                }
                if (stk.isEmpty() || stk.peek() < 0) 
                {
                   stk.push(current);
                } 
                else if (stk.peek() == -current) 
                {
                    stk.pop();
                }
            }
        }

        int[] ans = new int[stk.size()];
        for (int i = ans.length - 1; i >= 0; i--)
        {
            ans[i] = stk.pop();
        }
        return ans;
    } 
}


/**for(int i=n-1;i>=0;i--)
        {
            if(stk.isEmpty()) stk.push(asteroids[i]);
            if(!stk.isEmpty() && stk.peek()<0 && (stk.peek()*-1)<asteroids[i])
            {
                stk.pop();
                stk.push(asteroids[i]);
            }
            else if(!stk.isEmpty() && stk.peek()>0)
            {
                stk.push(asteroids[i]);
            }
        }
        
        // converting stack to array
        int[] result = new int[stk.size()];
        for (int i = 0; i <result.length; i++) {
            result[i] = stk.pop();
        }
        return result; */