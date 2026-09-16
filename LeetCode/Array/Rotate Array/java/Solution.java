class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];

        int val=k%nums.length;
        int j=0;
        for(int i=nums.length-val;i<nums.length;i++){
            arr[j++]=nums[i];
        }
        for(int i=0;i<nums.length-val;i++){
            arr[j++]=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }
}