public class TorusGameOfLife extends GameOfLife {

    TorusGameOfLife(){ }     //default construct//

    TorusGameOfLife(int size){       //sets up board when the size is passed//
        this.size = size;
        int[][] board = new int[size][size];
        this.board = board;
        int[][] previous = new int[size][size];
        this.previous = previous;
    }

    TorusGameOfLife(int[][] newBoard){       //passes a board and sets it as previous//
        size = newBoard.length;
        int[][] previous = new int[size][size];
        this.previous = previous;
        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard.length; j++) {
                previous[i][j] = newBoard[i][j];
            }
        }
        for (int i = 0; i < newBoard.length; i++){
            for (int j = 0; j < newBoard.length; j++){
                board[i][j] = newBoard[i][j];
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
            for (int j = 0; j < previous[i].length; j++){
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

    @Override
    int neighbors(int row, int col){
        int liveCount = 0;
        if (previous[(row - 1) % size][col] == 1){
            liveCount += 1;
        }
        if (previous[(row - 1 % size)][(col + 1) % size] == 1){
            liveCount += 1;
        }
        if (previous[row][(col + 1) % size] == 1){
            liveCount += 1;
        }
        if (previous[(row + 1) % size][(col + 1) % size] == 1){
            liveCount += 1;
        }
        if (previous[(row + 1) % size][col] == 1){
            liveCount += 1;
        }
        if (previous[(row +1) % size][(col - 1) % size] == 1){
            liveCount += 1;
        }
        if (previous[row][(col - 1) % size] == 1){
            liveCount += 1;
        }
        if (previous[(row - 1) % size][(col - 1) % size] == 1){
            liveCount += 1;
        }
        return liveCount;

        //use modulus function
        //-1 % 7 = 6
        //how is this useful?
        //if my size is 7 and im looking at row 2 then 2 % 7 is my current row
        //if the row I am looking at is 6 then 6%7 is but i also want the next row so 6 + 1 is 7 and 7 % 7 is 0 so it
        //wraps around nicely//
    }

    void evolution(int n){          //calls one step method the number of times the user enters//
        for (int i = n; i > 0; i--){
            oneStep();
        }
    }

    void printBoard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
