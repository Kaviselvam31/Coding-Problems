class Solution {
    public int similarPairs(String[] w) {
        String str[]=new String[w.length];
        int ind=0;
        for(int i=0;i<w.length;i++){
            String arr[]=w[i].split("");
            Set<String> set=new HashSet<>();
            for(String j:arr){
                set.add(j);
            }
            String b="";
            for(String k:set){
               b+=k;
            }
        str[ind++]=b;
        }
    int count=0;
    for(int i=0;i<str.length;i++){
        for(int j=i+1;j<str.length;j++){
            if(str[i].contains(str[j])){
                if(str[i].length()==str[j].length()){
                    count++;
                }
            }
        }
    }
        System.out.print(Arrays.toString(str));
        return count;
    }
}