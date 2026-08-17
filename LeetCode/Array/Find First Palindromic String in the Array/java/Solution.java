class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            String val=sb.reverse().toString();
            if(words[i].equals(val)){
                return words[i];
            }
        }
        return "";
    }
}