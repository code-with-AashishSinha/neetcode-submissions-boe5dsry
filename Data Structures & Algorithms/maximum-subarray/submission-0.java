class Solution {
    public int maxSubArray(int[] nums) {
         // Code here
        int c=0;
        int max=Integer.MIN_VALUE;
        //for only one element
        if(nums.length==1){
            max=nums[0];
            return max;
        }
        if(isnegative(nums)){
            for(int i=0;i<nums.length;i++){
               if(nums[i]>max){
                   max=nums[i];
               }
            }
            return max;
        }else{
        
        //for normal condition ...
        for(int i=0;i<nums.length;i++){
            c=c+nums[i];
            if(c<0){
                c=0;
            }
            if(c>max){
                max=c;
            }
        }}
        return max;
    }
     private static boolean isnegative(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return false;
            }
            
        }
        return true;
    }
}
