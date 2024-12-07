class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb=0;
        int ub=nums.length-1;
        int mid;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(nums[mid] == target)
                // printf(mid)
                return mid;
            else if(nums[mid] < target)
                lb= mid+1;
            else
                ub = mid-1;        
        }
        return lb;
    }
}