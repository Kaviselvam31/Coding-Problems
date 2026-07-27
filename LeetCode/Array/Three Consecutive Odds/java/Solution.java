class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
          int count=0;
          int val=3;
          for(int i=0;i<arr.length;i++){
              if(arr[i]%2==1){
                count++;
                if(count==val){
                    return true;
                }
              }
            else{
                count=0;
            }
          }
          return false;
    }
}