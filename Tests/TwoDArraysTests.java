import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TwoDArraysTests {

    @Test
    public void sumAllPositive() {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        assertEquals(45, TwoDArrays.sumAll(arr));
    }

    @Test
    public void sumAllNegative() {
        int[][] arr = {{-1,-2,-3}, {-4,-5,-6}, {-7,-8,-9}};
        assertEquals(-45, TwoDArrays.sumAll(arr));
    }

    @Test
    public void sumAllMixed() {
        int[][] arr = {{-1,-2,3}, {-4,5,-6}, {-7,-8,9}};
        assertEquals(-11, TwoDArrays.sumAll(arr));
    }


    @Test
    public void maxValuePositive() {
        int[][] arr = {{21, -4, 89}, {65, 33, 1}, {8, 3, 99}, {-2, 3, 1}};
        assertEquals(99, TwoDArrays.maxValue(arr));
    }

    @Test
    public void maxValueNegative() {
        int[][] arr = {{-21, -4, -89}, {-65, -33, -1}, {-8, -3, -99}, {-2, -3, -1}};
        assertEquals(-1, TwoDArrays.maxValue(arr));
    }

    /*
    @Test
    public void squareArrayTest() {
        int[][] expected2 = new int[][] {{0, 1}, { 2, 1}};
        int[][] expected3 = new int[][] {{0, 0, 1}, { 0, 2, 1 } , { 3, 2, 1}};
        int[][] expected4 = new int[][] {{0, 0, 0, 1}, {0, 0, 2, 1}, {0, 3, 2, 1}, {4, 3, 2, 1}};
        assertArrayEquals(expected2, TwoDArrays.squareArray(2));
        assertArrayEquals(expected3, TwoDArrays.squareArray(3));
        assertArrayEquals(expected4, TwoDArrays.squareArray(4));
    }

     */


}