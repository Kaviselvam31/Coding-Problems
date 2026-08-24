class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int d1=Math.abs(arr[i]-arr[j]);
                    int d2=Math.abs(arr[j]-arr[k]);
                    int d3=Math.abs(arr[i]-arr[k]);
                    if(d1<=a && d2<=b && d3<=c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}