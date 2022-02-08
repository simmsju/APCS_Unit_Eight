import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ArrayCalculationsTests {

    public static int[][] arr = {{1, 2, 3, 4}, {9, 7, 4, 3}, {0, 2, 5, 1}};
    public static int[][] arr2 = {{21, -4, 89}, {65, 33, 1}, {8, 3, 99}, {-2, 3, 1}};
    public static int[][] arr3 = {{5, 19, 3, -6}, {12, 2, -4, 0}, {11, -9, 1, 1}, {-13, -8, 3, -6}};

    @Test
    @Order(1)
    public void rowSumBadHigh() {
        assertEquals(-1, ArrayCalculations.rowSum(arr, 4));
    }

    @Test
    @Order(2)
    public void rowSumBadLow() {
        assertEquals(-1, ArrayCalculations.rowSum(arr, -1));
    }

    @Test
    @Order(3)
    public void rowSum() {
        assertEquals(23, ArrayCalculations.rowSum(arr, 1));

    }

    @Test
    @Order(4)
    public void columnSum() {
        assertEquals(190, ArrayCalculations.columnSum(arr2, 2));
    }

    @Test
    @Order(5)
    public void columnSumBadLow() {
        assertEquals(-1, ArrayCalculations.columnSum(arr2, -4));
    }

    @Test
    @Order(6)
    public void columnSumBadHigh() {
        assertEquals(-1, ArrayCalculations.columnSum(arr2, arr2.length));
    }

    @Test
    @Order(7)
    public void diagonalSumUp() {
        assertEquals(-32, ArrayCalculations.diagonalSum(arr3, 1));
    }

    @Test
    @Order(8)
    public void diagonalSumDown() {
        assertEquals(2, ArrayCalculations.diagonalSum(arr3, 0));
    }

    @Test
    @Order(9)
    public void diagonalSumBad() {
        assertEquals(-1, ArrayCalculations.diagonalSum(arr3, 3));
    }
}
