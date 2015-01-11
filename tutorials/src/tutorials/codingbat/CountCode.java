package tutorials.codingbat;

import tutorials.*;

class Count {

    int countCode(String str) {
        int codeCount = 0;
        String code = "";
        for (int i = 0; i < str.length() - 3; i++) {
            code = str.substring(i, i + 4);
            if (code.matches("co(.*)e")) {
                codeCount += 1;
            }
        }
        return codeCount;
    }

}

public class CountCode {

    public static void main(String[] args) {
        //System.out.println(CountCode("cobexxcode"))  ;
        Count count = new Count();
        System.out.println(count.countCode("cobexxcode"));
    }
/*
    public static int CountCode(String str) {
        int codeCount = 0;
        String code = "";
        for (int i = 0; i < str.length() - 3; i++) {
            System.out.println(str.substring(i, i + 4));
            code = str.substring(i, i + 4);
            if (code.matches("co(.*)e")) {
                codeCount += 1;
            }
        }
        System.out.println(codeCount);
        return codeCount;
    }
    */
}
