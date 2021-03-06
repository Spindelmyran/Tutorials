package tutorials.tutorialspoint.builderPattern;

import java.util.Arrays;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.10
 */
public class ArraysSortLong {
    public static void main(String[] args) {

        // initializing unsorted long array
        long lArr[] = {22, 10, 91, 62, 46};

        // let us print all the elements available in list
        for (long number : lArr) {
            System.out.println("Number = " + number);
        }

        // sorting array
        Arrays.sort(lArr);

        // let us print all the elements available in list
        System.out.println("The sorted long array is:");
        for (long number : lArr) {
            System.out.println("Number = " + number);
        }
    }
}
