class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(backtrack(board,word,visited,0,r,c)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean backtrack(char[][]board,String word,boolean[][]visited,int index,int r,int c){
        //base condition...
        if(index==word.length()){
            return true;
        }
        if(r<0 || c<0 || r>=board.length || c>=board[0].length){
            return false;
        }
        if(visited[r][c]){
            return false;
        }
        if(word.charAt(index)!=board[r][c]){
            return false;
        }
        visited[r][c]=true;
        boolean found= backtrack(board,word,visited,index+1,r+1,c) ||
                        backtrack(board,word,visited,index+1,r-1,c) ||
                        backtrack(board,word,visited,index+1,r,c+1) ||
                        backtrack(board,word,visited,index+1,r,c-1);
                        visited[r][c]=false;
                        return found;
                        

    }
}
