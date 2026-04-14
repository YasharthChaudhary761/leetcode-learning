class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0, r=0;
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        while(r<n)
        {
            if(Math.abs(l-r)>k)
            {
                set.remove(nums[l]);
                l++;
            }
            if(set.contains(nums[r])) return true;
            set.add(nums[r]);
            r++;
        }
        return false;
    }
}

// Correct code hai bs TLE show kr rha hai


//  int n = nums.length;

//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j < n; j++) {
//                 if(nums[i] == nums[j] && Math.abs(i - j) <= k) {
//                     return true;
//                 }
//             }
//         }
//         return false;