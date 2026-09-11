class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String num1=String.valueOf(num);
        for(int i=0;i<=num1.length()-k;i++){
               String sub=num1.substring(i,i+k);
               Integer val=Integer.valueOf(sub);
               if( val!=0 && num%val==0 ){
                count++;
               }
        }
        return count;
    }
}