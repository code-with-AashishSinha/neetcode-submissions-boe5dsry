class Solution {
    public void rotate(int[] nums, int k) {
       
       //step 1: reverse a array....
       //step 2: reverse a number from 0 to k-1......
       //step 3: reverse a remaining number....
       //here k=k%n{nums.length}
       int i=0;
       int j=nums.length-1;
       k=k%nums.length;
       reverse(i,j,nums);
       reverse(i,k-1,nums);
       reverse(k,j,nums);

    }
    public static int[] reverse(int i, int j,int nums[]){
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