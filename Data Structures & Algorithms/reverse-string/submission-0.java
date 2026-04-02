class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char start,end;
        for(int i=0;i<(s.length)/2;i++){
            start=s[i];
            end=s[n-i-1];
            //now we have to swap this ...
            char temp=start;
            start=end;
            end=temp;
            s[i] = start;
            s[n-i-1] = end;
        }
    }
}