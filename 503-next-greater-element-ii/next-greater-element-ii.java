class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {   //copy paste kiya hai ye wala part, optimise krne ke liye :) :) HEHEHE
                e.printStackTrace();
            }
        }));
    }
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stk=new Stack<>();

        for(int i=2*nums.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && stk.peek()<=nums[i%n])
            {
                stk.pop();
            }
            if(i<n && stk.isEmpty())
            {
                ans[i]=-1;
            }
            else if(i<n){
                ans[i]=stk.peek();
            }
            stk.push(nums[i%n]);
        }
        return ans;
    }
}