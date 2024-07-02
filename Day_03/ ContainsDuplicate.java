// 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Brute force approach
        // for(int i=0;i<nums.length-1;i++){
        // for(int j=i+1;j<nums.length;j++){
        // if(nums[i] == nums[j]){
        // return true;
        // }
        // }
        // } return false; //Time Limit Exceeded


        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;


        // HashSet<Integer> numbers = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(numbers.contains(nums[i]))
        //         return true;

        //         numbers.add(nums[i]);
        // }return false;            
    }
}
//Same as ArrayList