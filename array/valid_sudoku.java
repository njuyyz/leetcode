public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //rows
        for(int i = 0; i < 9; i++){
            boolean row[] = new boolean[9];
            for( int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int temp = board[i][j] - '0';
                    if(row[temp-1]){
                        return false;
                    }else{
                        row[temp-1] = true;
                    }
                }
            }
        }
        //column
        for(int i = 0; i < 9; i++){
            boolean column[] = new boolean[9];
            for( int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    int temp = board[j][i] - '0';
                    if(column[temp-1]){
                        return false;
                    }else{
                        column[temp-1] = true;
                    }
                }
            }
        }
        //cube
        for(int i = 0; i < 3; i++){
            for(int j =0 ; j < 3; j++){
                boolean cube[] = new boolean[9];
                for(int k = 0; k <3; k++){
                    for( int m = 0; m < 3; m++){
                        if(board[3*i+k][3*j+m]!='.'){
                            int temp = board[3*i+k][3*j+m] - '0';
                            if(cube[temp-1]){
                                return false;
                            }else{
                                cube[temp-1] = true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}