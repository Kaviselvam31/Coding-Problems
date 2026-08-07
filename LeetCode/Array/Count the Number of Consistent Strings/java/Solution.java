class Solution {
    public int countConsistentStrings(String all, String[] w) {
        int count=0;
        for(int i=0;i<w.length;i++){
            String arr[]=w[i].split("");
            boolean k=false;
    for(int j=0;j<arr.length;j++){
        if(all.contains(arr[j])){
            k=true;
        }
        else{
            k=false;
            break;
        }
    }
    if(k){
        count++;
    }
        }
        return count;
    }
}