class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n==0) return true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                boolean left=(i==0) ||(arr[i-1]==0) ;
                boolean right=(i==arr.length-1) || (arr[i+1]==0);
                
                if(left && right)
                {
                    arr[i]=1;
                    n--;
                }
            }
        }
        if(n>0) return false;
        return true;
    }
}


//ye sir se puchna hai ek case accept nii ho rha hai
/**Stack<Integer> stk=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(stk.isEmpty()) stk.push(arr[i]);
            else{
                if( i< arr.length-1 && stk.peek()==0 && arr[i+1]==0)
                {
                    stk.push(1);
                    n--;
                }
                else if(stk.peek()==0 && arr[i]==1){
                    stk.push(1);
                }
                else{
                    stk.push(arr[i]);
                }
            }
        }
        if(n<1) return true;
        return false; */