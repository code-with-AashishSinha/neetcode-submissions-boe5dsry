class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String>list=new ArrayList<>();
        String map[]={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        if(digits.isEmpty()){
            return list;
        }
        helper(digits,map,list,"");
        return list;
    }
    static void helper(String digits,String[]map,ArrayList<String>list,String p){
        if(digits.isEmpty()){
            list.add(p);
            return;
        }
        String letter=map[digits.charAt(0)-'0'];
        for(char ch: letter.toCharArray()){
          helper(digits.substring(1),map,list,p+ch);
        }
    }
}
