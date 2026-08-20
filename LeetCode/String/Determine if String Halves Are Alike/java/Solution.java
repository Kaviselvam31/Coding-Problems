class Solution {
    public boolean halvesAreAlike(String s) {
        int val=s.length()/2;
        String []str=s.split("");
        String vow="aeiouAEIOU";
        int count=0;
        for(int i=0;i<val;i++){
        if(vow.contains(str[i])){
          count++;
         }
        }
        System.out.print(count);
        int count1=0;
        for(int i=val;i<s.length();i++){
                  System.out.print(str[i]);
      if(vow.contains(str[i])){
        count1++;
      } 
        }
        if(count1==count){
            return true;
        }
        return false;
    }
}