class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1=new LinkedHashSet<>();
       Set<Integer> set2=new LinkedHashSet<>();
       for(int i:nums1){
        set1.add(i);
       }
        for(int i:nums2){
        set2.add(i);
       }
       
       List<Integer> list=new ArrayList<>(set1);
       List<Integer> list1=new ArrayList<>(set2);
       List<Integer> list2=new ArrayList<>();
    for(int i=0;i<list.size();i++){
        if(list1.contains(list.get(i))){
            list2.add(list.get(i));
        }
    }
    int arr[]=new int[list2.size()];
    for(int i=0;i<list2.size();i++){
        arr[i]=list2.get(i);
    }
    return arr;
    }
}