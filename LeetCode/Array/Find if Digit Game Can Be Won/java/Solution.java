class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
       // int sum1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                sum+=nums[i];
            }
            else{
                sum-=nums[i];
            }
        }
        if(sum!=0){
            return true;
        }
        return false;
    }
}