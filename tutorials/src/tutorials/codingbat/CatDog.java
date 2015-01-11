package tutorials.codingbat;

import tutorials.*;

public class CatDog {

    public static void main(String[] args) {
        CatAndDog count1 = new CatAndDog();
        count1.str = "catdog";
        System.out.println(count1.countAnimals());
        CatAndDog count2 = new CatAndDog();
        count2.str = "catdogcat";
        System.out.println(count2.countAnimals());

    }

}
