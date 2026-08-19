class Solution {
    public int maxScore(int[] c, int k) {
        int wind=0;
        int maxsum=0;
        int k1=c.length-k;
        int sum=0;
        for(int i=0;i<c.length;i++) {
            sum+=c[i];
        }
     //   System.out.print(sum);
        for(int i=0;i<k1;i++){
            wind+=c[i];
        }
        maxsum=sum-wind;
        for(int i=k1;i<c.length;i++){
            wind+=c[i]-c[i-k1];
            int val=sum-wind;
          maxsum=Math.max(val,maxsum);
         // maxsum=wind;
        }
        return maxsum;
    }
}