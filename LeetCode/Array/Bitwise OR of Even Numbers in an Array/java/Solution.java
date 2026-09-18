class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int val=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)!=1){
               val|=nums[i];
            }
        }
        return val;
    }
}