class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String>list=new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        return helper(digits,"");
    }
    private static List<String> helper(String digits,String p){
        ArrayList<String>list=new ArrayList<>();
        if(digits.isEmpty()){
            list.add(p);
            return list;
        }
        int digit=digits.charAt(0)-'0';//give out the '2' to 2..
        if(digit==7){
            for(int i=15;i<19;i++){
                char ch=(char)(i+'a');
                list.addAll(helper(digits.substring(1),p+ch));
            }
        }else if(digit==8){
            for(int i=19;i<22;i++){
                char ch=(char)(i+'a');
                list.addAll(helper(digits.substring(1),p+ch));
        }}else if(digit==9){
             for(int i=22;i<26;i++){
                char ch=(char)(i+'a');
                list.addAll(helper(digits.substring(1),p+ch));
        }}
        else{
        for(int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch= (char)(i+'a');
            list.addAll(helper(digits.substring(1),p+ch));
        }}
        return list;
    }
}
