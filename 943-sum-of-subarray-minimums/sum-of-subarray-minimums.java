class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        long mod = 1000000007;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && 
                   (i == n || arr[stack.peek()] > arr[i])) {

                int mid = stack.pop();
                int left = stack.isEmpty() ? mid + 1 : mid - stack.peek();
                int right = i - mid;

                sum += (long) arr[mid] * left * right;
                sum %= mod;
            }
            stack.push(i);
        }
        return (int) sum;
    }
}
        


 /**int sum=0;
        for(int i=0;i<arr.length;++i)
        {
            int min=arr[i];
            for(int j=i;j<arr.length;++j)
            {
                min=Math.min(min, arr[j]);
                sum=(sum+min) % MOD;
            }
        }
        return sum; */