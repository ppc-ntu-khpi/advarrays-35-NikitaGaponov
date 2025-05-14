
package domain;

import java.util.Arrays;

/**
 * Class for finding maximum elements in matrix rows
 */
public class Exercise {
    /**
     * Finds maximum element in each row of the matrix
     * @param matrix Input matrix of integers
     * @return Array containing maximum elements from each row
     */
    public static int[] findRowMaxElements(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        return Arrays.stream(matrix)
                    .mapToInt(row -> Arrays.stream(row)
                                          .max()
                                          .orElse(0))
                    .toArray();
    }
}
