import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MagicSquareTests {

    MagicSquare m1 = new MagicSquare( new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,17}});
    MagicSquare m2 = new MagicSquare( new int[][] {{7,12,1,14},{2,13,8,11},{16,3,10,5},{9,6,15,4}});
    MagicSquare m3 = new MagicSquare( new int[][] {{8,58,59,5,4,62,63,1}, {49, 15, 14, 52, 53, 11, 10, 56},
            {41, 23, 22, 44, 45, 19, 18, 48}, {32, 34, 35, 29, 28, 38, 39, 25},
            {40, 26, 27, 37, 36, 30, 31, 33}, {17, 47, 46, 20, 21, 43, 42, 24},
            {9, 55, 54, 12, 13, 51, 50, 16}, {64, 2, 3, 61, 60, 6, 7, 57 }});
    MagicSquare m4 = new MagicSquare( new int[][] {{8,58,59,5,4,62,63,1}, {49, 15, 14, 52, 53, 11, 10, 56},
            {41, 23, 22, 44, 45, 19, 18, 48}, {32, 34, 35, 29, 28, 38, 39, 25},
            {40, 26, 27, 37, 36, 30, 31, 33}, {17, 47, 46, 20, 21, 43, 42, 57},
            {9, 55, 54, 12, 13, 51, 50, 16}, {64, 2, 3, 61, 60, 6, 7, 24 }});

    @Test
    @Order(1)
    public void rowSumTest() {
        assertEquals(58, m1.rowSum(3));
        assertEquals(34, m2.rowSum(2));
        assertEquals(260, m3.rowSum(5));
        assertEquals(227, m4.rowSum(7));
    }

    @Test
    @Order(2)
    public void colSumTest() {
        assertEquals(32, m1.colSum(1));
        assertEquals(34, m2.colSum(3));
        assertEquals(260, m3.colSum(4));
        assertEquals(227, m4.colSum(7));
    }

    @Test
    @Order(3)
    public void upDiagSumTest() {
        assertEquals(34, m1.upDiagSum());
        assertEquals(34, m2.upDiagSum());
        assertEquals(260, m3.upDiagSum());
        assertEquals(260, m4.upDiagSum());
    }

    @Test
    @Order(4)
    public void downDiagSumTest() {
        assertEquals(35, m1.downDiagSum());
        assertEquals(34, m2.downDiagSum());
        assertEquals(260, m3.downDiagSum());
        assertEquals(227, m4.downDiagSum());
    }

    @Test
    @Order(5)
    public void isMagicSquareTest() {
        assertFalse(m1.isMagicSquare());
        assertTrue(m2.isMagicSquare());
        assertTrue(m3.isMagicSquare());
        assertFalse(m4.isMagicSquare());
    }

}
