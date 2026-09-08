class Solution {
    public boolean areOccurrencesEqual(String s) {
        String arr[]=s.split("");
        Map<String,Integer> map=new HashMap<>();
        for(String i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        boolean k=false;
        int num=0;
        int count=0;
        if(map.size()==1){
            return true;
        }
       for(Integer fr:map.values()){
         if(count==0){
            num=fr;
            count++;
         }
         else if(fr!=num){
                k=false;
                break;
             }
             else{
               k=true;
             }
    }
       return k;
}
}