public class TorusGameOfLife extends GameOfLife {
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
}
