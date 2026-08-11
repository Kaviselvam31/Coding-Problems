class Solution {
    public String truncateSentence(String s, int k) {
        String a="";
        String []arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(k!=i){
                a+=arr[i]+" ";
            }
            else{
                break;
            }
        }
        String val=a.trim();
        return val;
    }
}