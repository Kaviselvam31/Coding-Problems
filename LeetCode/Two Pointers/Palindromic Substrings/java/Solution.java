class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
            StringBuilder sb=new StringBuilder(sub);
            String val=sb.reverse().toString();
            if(sub.equals(val)){
                count++;
            }
            }
        }
        return count;
    }
}