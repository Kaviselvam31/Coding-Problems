class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
int x1=x;
        while(x1!=0){
            int rem=x1%10;
            sum+=rem;
            x1/=10;
        }
        if(x%sum==0){
            return sum;
        }
       return -1;
    }
}