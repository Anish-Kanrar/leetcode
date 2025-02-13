//1.Two sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Avoid using the same index twice
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};  // Correct syntax for returning an array
                }
            }
        }
        return new int[]{-1, -1};  // Return [-1, -1] if no solution is found
    }
}
