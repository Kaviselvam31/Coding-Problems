class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> list=new ArrayList<>();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            char a=arr[i].charAt(0);
            if(Character.isDigit(a)){
                Integer val=Integer.valueOf(arr[i]);
                list.add(val);
            }
        }
        boolean k=false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                k=true;
            }
            else{
                k=false;
                break;
            }
        }
    // System.out.print(list);
    if(k){
        return true;
    }
return false;
    }
}