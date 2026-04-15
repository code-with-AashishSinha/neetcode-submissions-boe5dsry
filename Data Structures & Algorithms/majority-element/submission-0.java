class Solution {
    public int majorityElement(int[] nums) {
         int count=1;
        int k=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<k;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                if(count>(k/2)){
                    return nums[i-1];
                }else{
                    count=1;
                }
            }


        }
        return nums[k-1];
    }
}