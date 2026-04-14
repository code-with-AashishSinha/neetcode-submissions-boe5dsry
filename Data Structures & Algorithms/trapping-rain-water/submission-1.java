class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int prefixMax[]=new int[n];
        prefixMax[0]=height[0];
        for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
        }
        int suffixmax[]=new int[n];
        suffixmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmax[i]=Math.max(suffixmax[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int water=Math.min(prefixMax[i],suffixmax[i])-height[i];
            ans=ans+water;
        }
        return ans;
    }
}
