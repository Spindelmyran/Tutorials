package tutorials.codingbat;

import tutorials.*;

public class CatAndDog {
    String str;

    boolean countAnimals() {
            int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            System.out.println(str.substring(i, i + 3));
            if (str.substring(i, i + 3).equals("cat")) {
                catCount += 1;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount += 1;
            }
        }
        return (catCount == dogCount); }


}
