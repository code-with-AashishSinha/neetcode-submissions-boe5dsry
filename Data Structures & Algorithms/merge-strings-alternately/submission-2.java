class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0,j = 0,k=0;
        StringBuilder mix=new StringBuilder();
        int n=word1.length()+word2.length();
        
            while(i<word1.length() && j<word2.length()){
                if(i==j){
                    mix.append(word1.charAt(i));
                    i++;
                    k++;
                }else{
                    mix.append(word2.charAt(j));
                    j++;
                    k++;
                }
            }
            while(i<word1.length()){
                mix.append(word1.charAt(i));
                i++;
                k++;
            }
            while(j<word2.length()){
                mix.append(word2.charAt(j));
                j++;
                k++;
            }
        
        
    
        return mix.toString();
    }
}