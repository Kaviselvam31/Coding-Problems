class Solution {
    public int[] finalPrices(int[] p) {
        int arr[]=new int[p.length];
        for(int i=0;i<p.length;i++){
            boolean k=false;
            for(int j=i+1;j<p.length;j++){
                if(p[i]>=p[j]){
                    arr[i]=p[i]-p[j];
                    k=false;
                    break;
                }
                else{
                    k=true;
                }
            }
            if(k){
                arr[i]=p[i];
            }
        }
        arr[arr.length-1]=p[p.length-1];
        return arr;
    }
}