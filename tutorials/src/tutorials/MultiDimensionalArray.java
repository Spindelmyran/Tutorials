package tutorials;
/**
 *
 * @author tonyandersson
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] values = {3,5,3243};
        System.out.println(values[2]);
        int[][] grid = {
            {3,5,2343},
            {2,4},
            {1,2,3,4}   
      };
        System.out.println(grid[1][1]);
         System.out.println(grid[0][2]);
    }
}
