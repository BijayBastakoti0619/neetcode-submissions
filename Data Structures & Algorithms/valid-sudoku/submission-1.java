class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[] rows= new HashSet[9];
        Set<Character>[] cols= new HashSet[9];
        Set<Character>[] boxes= new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]= new HashSet<>();
            cols[i]= new HashSet<>();
            boxes[i]= new HashSet<>();

        } 

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                
                char value= board[row][col];

                if(value=='.'){
                    continue;
                }

                int box= (row/3)* 3 + (col/3);


                if(rows[row].contains(value)){
                    return false;
                }

                if(cols[col].contains(value)){
                    return false;

                }
                if(boxes[box].contains(value)){
                    return false;
                }

                rows[row].add(value);
                cols[col].add(value);
                boxes[box].add(value);

            }
        }
        return true;
    }
}
