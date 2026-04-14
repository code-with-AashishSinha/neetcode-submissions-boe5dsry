class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ans=Math.abs(i-j);
                    if(ans<=k){
                        return true;
                    }
                }
            }
            
        }
        return false;
    }
}