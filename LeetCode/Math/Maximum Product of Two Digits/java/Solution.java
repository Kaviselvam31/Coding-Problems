class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int arr[]=new int[s.length()];
        int ind=0;
        while(n!=0){
            int rem=n%10;
            arr[ind++]=rem;
            n/=10;
        }
        int maxproduct=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              int mul=arr[i]*arr[j];
              if(mul>maxproduct){
                maxproduct=mul;
              }
            }
        }
        return maxproduct;
    }
}