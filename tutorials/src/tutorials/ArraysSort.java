package tutorials;

import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class ArraysSort {
    public static void main(String[] args) {
     /*   Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(asList(numbers));
        int max = (int) Collections.max(asList(numbers));
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
*/

        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100) + 1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------------->");
// in reverse order
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
