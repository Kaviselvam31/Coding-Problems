class Solution {
    public int smallestEqual(int[] nums) {
         int small=Integer.MAX_VALUE;;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==i%10){
                if(i<small){
                    small=i;
                }
            }
         }
         if(small==Integer.MAX_VALUE){
            return -1;
         }
         return small;
    }
}