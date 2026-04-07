class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int answer[]={0,0};
        while(i<=j){
            if(i==j){
                    i++;
                    j=numbers.length-1;
                }
            if(numbers[i]+numbers[j]!=target){
                j--;
                
            }else{
                int []ans={i+1,j+1};
                return ans;
            }
        }
        return answer;
    }
}
