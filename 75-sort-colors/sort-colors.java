class Solution {
    public void sortColors(int[] nums) {
        insertionSort(nums);
        for(int value:nums)
        {
            System.out.print(value+" ");
        }
    }
    static void insertionSort(int []arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}