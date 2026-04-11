class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s==null || s.length()==0){
        //     return true;
        // }
        // int sum1=0;
        // int sum2=0;
        // for(int i=0;i<s.length();i++){
        //     sum1+=s.charAt(i);
        // }
        // for(int j=0;j<t.length();j++){
        //     sum2+=t.charAt(j);
        // }
        // if(s.length()==t.length() && sum1==sum2){
        //     return true;
        // }
        // return false;
        int n=s.length();
       int m=t.length();
       int sum=0;int sum1=0;
       if(n!=m){
        return false;
       }
       char a[]=s.toCharArray();
       char b[]=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       for(int i=0;i<n;i++){
        if(a[i]!=b[i]){
            return false;
        }
       }
       

        return true;
    }
}
