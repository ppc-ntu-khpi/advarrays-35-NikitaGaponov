
package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 3, 8, 2},
            {9, 4, 6, 3, 1},
            {2, 7, 8, 4, 5}
        };
        
        System.out.println("Original matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        
        int[] maxElements = Exercise.findRowMaxElements(matrix);
        System.out.println("\nMaximum elements in each row:");
        System.out.println(Arrays.toString(maxElements));
    }
}
