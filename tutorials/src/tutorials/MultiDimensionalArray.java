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
        
        String[][] texts = new String[2][3];
        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);
        String[][] words;
        words = new String[2][2];
        words[1][1] = "hi";
        System.out.println(words[1][1]);
        
        for(int row= 0; row<grid.length; row++){
            for(int col=0;col<grid[row].length; col++){
                System.out.print(grid[row][col]+"\t");
            }
            System.out.println();
        }
        String[][] wordsx = new String[2][];
        System.out.println(wordsx[0]);
        wordsx[0]=new String[3];
        wordsx[0][1]= "hi there";
        System.out.println(wordsx[0][1]);
    }
}
