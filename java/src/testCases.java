import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class testCases {
    @Test
    public static void{

    }
    @Test
    public static void testNeighbors1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 1;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        assertEquals(3, gol.neighbors(0, 0));
    }

}
