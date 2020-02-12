public class GameOfLife {
    int size;
    int[][] board;
    int[][] previous;


    GameOfLife(){ }     //default construct//

    GameOfLife(int size){       //sets up board when the size is passed//
        this.size = size;
        int[][] board = new int[size][size];
        int[][] previous = new int[size][size];
    }

    GameOfLife(int[][] newBoard){       //passes a board and sets it as previous//
        size = newBoard.length;
        int[][] previous = new int[size][size];
        int[][] board = new int[size][size];
        for (int i = 0; i < newBoard.length; i++){
            for (int j = 0; j < newBoard.length; j++){
                previous[i][j] = newBoard[i][j];
            }
        }
    }

    int[][] getBoard(){
            return board;
        }   //returns the current board when called/

    void oneStep(){         //changes the board//
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                previous[i][j] = board[i][j];//set previous to board//
            }
        }
        for (int i = 0; i < previous.length; i++){         //look at previous and change the squares in board//
            for (int j = 0; j < previous.length; j++){
                int cellsAlive = neighbors(i, j);//for each cell count neighbors and update state//
                if (previous[i][j] == 1){      //call neighbors in this method
                    if (cellsAlive < 2){
                        board[i][j] = 0;
                    }
                    else if (cellsAlive == 2 || cellsAlive == 3){
                        board[i][j] = 1;
                    }
                    else if (cellsAlive > 3){
                        board[i][j] = 0;
                    }
                }
                else{
                    if (cellsAlive == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }

    int neighbors(int row, int col){        //counts the number of live neighbors the cell has//
        int neighbor = 0;
        if(col == 0){       //conditions for the left edge of the board//
            if (row == 0){
                if(board[row][col + 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col + 1] == 1){
                    neighbor += 1;
                }
            }
            else if (row == board.length - 1){
                if(board[row - 1][col] == 1){
                    neighbor += 1;
                }
                if (board[row][col + 1] == 1){
                    neighbor += 1;
                }
                if (board[row - 1][col + 1] == 1){
                    neighbor += 1;
                }
            }
            else {
                if(board[row - 1][col] == 1){
                    neighbor += 1;
                }
                if (board[row - 1][col + 1] == 1){
                    neighbor += 1;
                }
                if (board[row][col + 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col + 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col] == 1){
                    neighbor += 1;
                }
            }
        }
        else if (col == board.length - 1){      //conditions for right edge of the board//
            if (row == 0){
                if(board[row][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col] == 1){
                    neighbor += 1;
                }
            }
            else if (row == board.length - 1){
                if(board[row][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row - 1][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row - 1][col] == 1){
                    neighbor += 1;
                }
            }
            else {
                if(board[row - 1][col] == 1){
                    neighbor += 1;
                }
                if (board[row - 1][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col - 1] == 1){
                    neighbor += 1;
                }
                if (board[row + 1][col] == 1){
                    neighbor += 1;
                }
            }
        }
        else{                                  //conditions for the rest of the board//
            if(board[row - 1][col] == 1){
                neighbor += 1;
            }
            if (board[row - 1][col + 1] == 1){
                neighbor += 1;
            }
            if (board[row][col + 1] == 1){
                neighbor += 1;
            }
            if(board[row + 1][col + 1] == 1){
                neighbor += 1;
            }
            if (board[row + 1][col] == 1){
                neighbor += 1;
            }
            if (board[row + 1][col - 1] == 1){
                neighbor += 1;
            }
            if (board[row][col - 1] == 1){
                neighbor += 1;
            }
            if (board[row - 1][col - 1] == 1){
                neighbor += 1;
            }
        }
        return neighbor;
    }

    void evolution(int n){          //calls one step method the number of times the user enters//
        for (int i = n; i > 0; i--){
            oneStep();
        }
    }

    void printBoard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j]);
            }
        }
    }

}
