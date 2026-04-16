class Solution {
    public int maxProfit(int[] prices) {
        var cp=Integer.MAX_VALUE;
        int ans=0;
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(cp<prices[i]){
                
                p=prices[i]-cp;
                ans=Math.max(ans,p);
               
            }else{
             cp=prices[i];
            }
        }
        return ans;
    }
}
