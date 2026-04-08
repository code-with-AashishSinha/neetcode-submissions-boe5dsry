class Solution {
    public void rotate(int[] nums, int k) {
       
        //step 1: reverse whole array...
        //step 2: reverse the element on to 0 to k-1..
        //step 3: reverse the remaining element in the array...
        int i=0;
        int j=nums.length-1;
        k=k%nums.length;
        output(nums, i, j);
        output(nums, i, k-1);
        output(nums,k,j);
    }
    public static int[] output(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
    
}