class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
    while(n!=1){
        if(n%2==1){
            int a=(n-1)/2;
            matches+=a;
            n=(n-1)/2+1;
        }
        else{
          int b=n/2;
          matches+=b;
          n=n/2;
        }
    }
        return matches;
    }
}