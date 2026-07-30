class Solution {
    public int findNonMinOrMax(int[] nums) {
       if(nums.length<=2){
        return -1;
       } 
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int val=0;

       for(int i=0;i<nums.length;i++){
      if(nums[i]>max){
        max=nums[i];
      }
       }
       for(int i=0;i<nums.length;i++){
       if(nums[i]<min){
        min=nums[i];
      }
       }
       
       System.out.println(min);
       System.out.print(max);
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=min && nums[i]!=max){
            val=nums[i];
            break;
        }
       }
       return val;
    }
}