class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String>result=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return result;
        }
        String []map={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        helper(digits,result,map,new StringBuilder(),0);
        return result;
    }     
    private static void helper(String digits,ArrayList<String>result,String[]map,StringBuilder p,int i){
        if(digits.length()==i){
            result.add(p.toString());
            return;
        }
        String letter=map[digits.charAt(i)-'0'];
        for(char ch: letter.toCharArray()){
            p.append(ch);
            helper(digits,result,map,p,i+1);
            p.deleteCharAt(p.length()-1);
        }
    }
}
