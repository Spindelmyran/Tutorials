
package tutorials;

import java.util.Scanner;

/**
 *
 * @author tonyandersson
 */
public class GetUserInput {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Output the prompt
        System.out.println("Enter the floating point value: ");
        // Wait for the user to enter something.
        double value = input.nextDouble();
        // Tell them what they entered.
        System.out.println("You entered: "+value);
    }
    
}
