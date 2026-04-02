class Solution {
    public int removeDuplicates(int[] nums) {
         int i=0,k=0;
        while(i<nums.length){
            if(i==nums.length-1){
                nums[k]=nums[i];
                break;
            }
            
            if(nums[i]==nums[i+1]){
                i++;
            }else{
                nums[k]=nums[i];
                i++;
                k++;
            }
            
        }
        return k+1;
    }
} 