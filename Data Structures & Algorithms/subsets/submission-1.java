class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>outerlist=new ArrayList<>();
       
        outerlist.add(new ArrayList<>());
        for(int num:nums){
            int n=outerlist.size();
            for(int i=0;i<n;i++){
                List<Integer>innerlist=new ArrayList<>(outerlist.get(i));
                innerlist.add(num);
                outerlist.add(innerlist);
            }
        }
        return outerlist;
    }
}
