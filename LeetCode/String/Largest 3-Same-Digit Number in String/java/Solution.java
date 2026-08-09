class Solution {
    public String largestGoodInteger(String num) {
       int max=Integer.MIN_VALUE;
       String b="";
       String arr[]=num.split("");
       for(int i=0;i<arr.length;i++){
        int count=0;
        for(int j=i;j<arr.length;j++){
            if(arr[j].equals(arr[i])){
                count++;
            }
            else{
                break;
            }
        }
            Integer val=Integer.valueOf(arr[i]);
               // System.out.print(val+" ");
        if(count==3){
            if(val>max){
                max=val;
                System.out.print(max);
                b="";
                for(int k=0;k<3;k++){
                    b+=arr[i];
                }
            }
        }
       } 
       return b;
    }
}