class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n=s.length();
        Character.isLetterOrDigit(n);
        int start=0;
        int end=n-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                boolean i=isPalindromee(s,start,end);
                boolean j=isPalindrome3(s, start, end);
                if(i||j){
                    return true;
                }else{
                    return false;
                }
            }
            start++;
            end--;
            
        }
        return true;
    }
    public static boolean isPalindromee(String s,int start,int end){
        start=start+1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
        
        
    }
    public static boolean isPalindrome3(String s,int start,int end){
        end=end-1;
         while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }
}