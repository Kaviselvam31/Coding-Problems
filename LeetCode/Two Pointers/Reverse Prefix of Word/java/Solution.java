class Solution {
    public String reversePrefix(String word, char ch) {
        String a="";
        String b="";
        String arr[]=word.split("");
        int j=0;
        for(int i=0;i<arr.length;i++){
            char c=arr[i].charAt(0);
            if(c!=ch){
                a+=arr[i];
            }
            else{
                a+=arr[i];
                j=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder(a);
        String c=sb.reverse().toString();
        int count=0;
       for(int i=j+1;i<arr.length;i++){
        b+=arr[i];
       }
        String out=c+b;
        if(word.length()!=out.length()){
            return word;
        }
        return out;
    }
}