import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TwoDArraysTests {

    @Test
    @Order(3)
    public void sumAllPositive() {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        assertEquals(45, TwoDArrays.sumAll(arr));
    }

    @Test
    @Order(4)
    public void sumAllNegative() {
        int[][] arr = {{-1,-2,-3}, {-4,-5,-6}, {-7,-8,-9}};
        assertEquals(-45, TwoDArrays.sumAll(arr));
    }

    @Test
    @Order(5)
    public void sumAllMixed() {
        int[][] arr = {{-1,-2,3}, {-4,5,-6}, {-7,-8,9}};
        assertEquals(-11, TwoDArrays.sumAll(arr));
    }


    @Test
    @Order(1)
    public void maxValuePositive() {
        int[][] arr = {{21, -4, 89}, {65, 33, 1}, {8, 3, 99}, {-2, 3, 1}};
        assertEquals(99, TwoDArrays.maxValue(arr));
    }

    @Test
    @Order(2)
    public void maxValueNegative() {
        int[][] arr = {{-21, -4, -89}, {-65, -33, -1}, {-8, -3, -99}, {-2, -3, -1}};
        assertEquals(-1, TwoDArrays.maxValue(arr));
    }


}