class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int arr[]=new int[gain.length+1];
    arr[0]=0;
    int j=1;
    for(int i=0;i<gain.length;i++){
        arr[j++]=arr[i]+gain[i];
    }
    for(int i:arr){
        if(i>max){
            max=i;
        }
    }
    return max;
    }
}