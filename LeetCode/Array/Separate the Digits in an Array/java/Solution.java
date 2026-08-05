class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        String a="";
        for(int i=0;i<nums.length;i++){
            String val=String.valueOf(nums[i]);
            a+=val;
        }
        String arr[]=a.split("");
        int str[]=new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++){
        Integer val=Integer.valueOf(arr[i]);
        str[j++]=val;
    }
    return str;
    }
}