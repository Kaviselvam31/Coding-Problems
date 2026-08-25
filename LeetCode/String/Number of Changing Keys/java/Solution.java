class Solution {
    public int countKeyChanges(String s) {
        String a=s.toUpperCase();
        char []ch=a.toCharArray();
        int count=0;
        for(int i=0;i<ch.length-1;i++){
           int c=ch[i]-'A';
           int b=ch[i+1]-'A';
           if(c!=b){
            count++;
           }
        }
        return count;
    }
}