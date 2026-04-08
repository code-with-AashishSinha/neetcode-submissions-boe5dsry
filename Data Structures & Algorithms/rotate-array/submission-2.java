class Solution {
    public void rotate(int[] nums, int k) {
        //step 1: reverse whole array...
        //step 2: reverse the element on to 0 to k-1..
        //step 3: reverse the remaining element in the array...
       int i=0,j=nums.length-1;//for first element..
       k=k%nums.length;
       while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
       i=0;
       j=k-1;
       while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
       i=k;
       j=nums.length-1;
       while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
       
    }
}