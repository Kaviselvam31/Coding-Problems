class Solution {
    public int distributeCandies(int[] candyType) {
        int a=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        if(set.size()==a){
            return a;
        }
        else if(set.size()>a){
            return a;
        }
        return set.size();
    }
}