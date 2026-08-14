1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max=Integer.MIN_VALUE;
4        int arr[]=new int[gain.length+1];
5    arr[0]=0;
6    int j=1;
7    for(int i=0;i<gain.length;i++){
8        arr[j++]=arr[i]+gain[i];
9    }
10    for(int i:arr){
11        if(i>max){
12            max=i;
13        }
14    }
15    return max;
16    }
17}