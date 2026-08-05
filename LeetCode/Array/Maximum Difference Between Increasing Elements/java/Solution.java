class Solution {
    public int maximumDifference(int[] nums) {
        int differ=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int a=(int)Math.abs(nums[i]-nums[j]);
                    if(a>differ){
                        differ=a;
                    }
                }
            }
        }
        return differ;
    }
}