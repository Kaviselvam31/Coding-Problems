class Solution {
    public String reversePrefix(String s, int k) {
    String []arr=s.split("");
        int i=0;
        int j=k-1;
        while(i<=j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String b="";
        for(String k1:arr){
            b+=k1;
        }
        return b;
    }
}