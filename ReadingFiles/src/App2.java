import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.6
 */
public class App2 {

    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:/Users/John/Desktop/example.txt";
        //String fileName = "example.txt";
        String fileName = "/home/tony/Desktop/mtgx/Projekt/ViasatDevice/smsd0051_utf.csv";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

/*        String searchString = in.toString();

        if(searchString.contains("02226829543")){
            System.out.println("true");
        }
        else{
            System.out.println("searchString: "+searchString);
        }*/

        // int value = in.nextInt();
        //  System.out.println("Read value: " + value);
        String searchString = "02226829543";
        in.nextLine();

        int count = 2;
        while(in.hasNextLine()) {
            String line = in.nextLine();
            if(line.contains(searchString)) {
                System.out.println(count + ": " + line);

            }

            count++;
        }

        in.close();
    }

}
