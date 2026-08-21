class Solution {
    public String sortSentence(String s) {
        String []arr=s.split(" ");
        String []out=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String []a=arr[i].split("");
            String val="";
            for(int j=0;j<a.length;j++){
                char ch=a[j].charAt(0);
                if(Character.isDigit(ch)){
                Integer v=Integer.valueOf(a[j]);
                int c=v-1;
                out[c]=val;      
                }
                else{
                    val+=a[j];
                }
            }
        }
        System.out.print(Arrays.toString(out));
        String out1="";
        for(String i:out){
            out1+=i+" ";
        }
        return out1.trim();
    }
}