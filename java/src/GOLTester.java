import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class GOLTester {

    @Test
    public void testOneStep1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        arr[1][2] = 1;
        arr[2][2] = 1;
        arr[3][2] = 1;

        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStep2(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        arr[1][3] = 1;
        arr[2][1] = 1;
        arr[2][4] = 1;
        arr[3][1] = 1;
        arr[3][4] = 1;
        arr[4][2] = 1;
        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStep3(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[3][4] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        arr[1][1] = 1;
        arr[1][2] = 1;
        arr[2][1] = 1;
        arr[3][1] = 1;
        arr[3][4] = 1;
        arr[4][3] = 1;
        arr[4][4] = 1;
        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());

    }

    @Test
    public static void testOneStep4(){
        int [][] array = new int[18][11];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][5] = 1;
        array[3][4] = 1;
        array[3][5] = 1;
        array[3][6] = 1;
        array[4][3] = 1;
        array[4][5] = 1;
        array[4][7] = 1;
        array[5][3] = 1;
        array[5][5] = 1;
        array[5][7] = 1;
        array[6][4] = 1;
        array[6][5] = 1;
        array[6][6] = 1;
        array[7][5] = 1;
        array[10][5] = 1;
        array[11][4] = 1;
        array[11][5] = 1;
        array[11][6] = 1;
        array[12][3] = 1;
        array[12][5] = 1;
        array[12][7] = 1;
        array[13][3] = 1;
        array[13][5] = 1;
        array[13][7] = 1;
        array[14][4] = 1;
        array[14][5] = 1;
        array[14][6] = 1;
        array[15][5] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[18][11];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }

        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStep5(){
        int [][] array = new int[18][11];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testNeighbors1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        assertEquals(2, gol.neighbors(2, 2));
    }

    @Test
    public static void testNeighbors2(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        assertEquals(2, gol.neighbors(3, 2));
    }

    @Test
    public static void testNeighbors3(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[3][4] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        GameOfLife gol = new GameOfLife(array);     //all that's left is to do the assert equals//
        assertEquals(4, gol.neighbors(2, 2));
    }

    @Test
    public static void testNeighbors4(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        assertEquals(0, gol.neighbors(1, 5));
    }

    @Test
    public static void testNeighbors5(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][0] = 1;
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][0] = 1;
        array[2][2] = 1;
        array[3][0] = 1;
        array[3][1] = 1;
        array[4][2] = 1;
        GameOfLife gol = new GameOfLife(array);
        assertEquals(8, gol.neighbors(2, 1));
    }

    @Test
    public static void testEvolution1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());
    }

    @Test
    public static void testEvolution2(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());       //should return the board to its original state//
    }

    @Test
    public static void testEvolution3(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[3][4] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        GameOfLife gol = new GameOfLife(array);
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());       //should return the board to its original state//
    }

    @Test
    public static void testEvolution4(){
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 1;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        int[][] arr = new int[][];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                arr[i][j] = 0;
            }
        }
        gol.evolution(2);
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testEvolution5(){
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 1;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        int[][] arr = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                arr[i][j] = 0;
            }
        }
        gol.evolution(2);
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStepTorus1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        int [][] arr = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        arr[1][2] = 1;
        arr[2][2] = 1;
        arr[3][2] = 1;

        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStepTorus2(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        arr[1][3] = 1;
        arr[2][1] = 1;
        arr[2][4] = 1;
        arr[3][1] = 1;
        arr[3][4] = 1;
        arr[4][2] = 1;
        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStepTorus3(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[3][4] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        arr[1][1] = 1;
        arr[1][2] = 1;
        arr[2][1] = 1;
        arr[3][1] = 1;
        arr[3][4] = 1;
        arr[4][3] = 1;
        arr[4][4] = 1;
        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStepTorus4(){
        int [][] array = new int[18][11];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][5] = 1;
        array[3][4] = 1;
        array[3][5] = 1;
        array[3][6] = 1;
        array[4][3] = 1;
        array[4][5] = 1;
        array[4][7] = 1;
        array[5][3] = 1;
        array[5][5] = 1;
        array[5][7] = 1;
        array[6][4] = 1;
        array[6][5] = 1;
        array[6][6] = 1;
        array[7][5] = 1;
        array[10][5] = 1;
        array[11][4] = 1;
        array[11][5] = 1;
        array[11][6] = 1;
        array[12][3] = 1;
        array[12][5] = 1;
        array[12][7] = 1;
        array[13][3] = 1;
        array[13][5] = 1;
        array[13][7] = 1;
        array[14][4] = 1;
        array[14][5] = 1;
        array[14][6] = 1;
        array[15][5] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[18][11];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }

        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void testOneStepTorus5(){
        int [][] array = new int[18][11];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        gol.oneStep();
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void Torusneighbors1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        int [][] arr = new int[5][5];
        assertEquals(2, gol.neighbors(2, 2));
    }

    @Test
    public static void Torusneighbors2(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        assertEquals(2, gol.neighbors(3, 2));
    }

    @Test
    public static void Torusneighbors3(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[3][4] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        assertEquals(4, gol.neighbors(2, 2));
    }

    @Test
    public static void Torusneighbors4(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        TorusGameOfLife gol = new TorusGameOfLife(array);
        assertEquals(0, gol.neighbors(1, 5));
    }

    @Test
    public static void Torusneighbors5(){
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[0][0] = 1;
        array[4][0] = 1;
        array[0][4] = 1;
        array[4][4] = 1;
        TorusGameOfLife gol = new TorusGameOfLife(array);
        assertEquals(3, gol.neighbors(0, 0));
    }

    @Test
    public static void TorusEvolution1(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());
    }

    @Test
    public static void TorusEvolution2(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[2][2] = 1;
        array[2][3] = 1;
        array[2][4] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;
        GameOfLife gol = new GameOfLife(array);
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());
    }

    @Test
    public static void TorusEvolution3(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[1][1] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[3][4] = 1;
        array[4][3] = 1;
        array[4][4] = 1;
        GameOfLife gol = new GameOfLife(array);
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());
    }

    @Test
    public static void TorusEvolution4(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        GameOfLife gol = new GameOfLife(array);
        int [][] arr = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        gol.evolution(2);
        assertArrayEquals(arr, gol.getBoard());
    }

    @Test
    public static void TorusEvolution5(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 0;
            }
        }
        array[0][0] = 1;
        array[0][5] = 1;
        array[5][0] = 1;
        array[5][5] = 1;
        GameOfLife gol = new GameOfLife(array);
        gol.evolution(2);
        assertArrayEquals(array, gol.getBoard());
    }
}
