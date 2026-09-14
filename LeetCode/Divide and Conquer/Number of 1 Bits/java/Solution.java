class Solution {
    public int hammingWeight(int n) {
        String b=Integer.toBinaryString(n);
        String []arr=b.split("");
        int count =0;
        for(String i:arr){
            if(i.equals("1")){
                count++;
            }
        }
        return count;
    }
}