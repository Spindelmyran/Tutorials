package tutorials;

public class PersonNummer {

    public static void main(String[] args) {
        String pnr = "7707110010"; //byt ut mot "YYMMDDXXXX"
        if(isPnrLegal(pnr)) {
            System.out.println("Giltligt!");
        }
        else {
            System.out.println("Ogiltligt!");
        }

    }

    public static boolean isPnrLegal(String s) {
        int[] pnr = stringToArray(s);
        int control = calculateControlNumber(pnr);
        return pnr[pnr.length-1] == control;
    }


    private static int[] stringToArray(String s) {
        int arr[] = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            arr[i] = (new Integer("" + s.charAt(i))).intValue();
        }
        return arr;
    }

    private static int calculateControlNumber(int[] arr) {
        int checkSum = 0;
        int temp = 0;
        int controlNumber;

        for(int i = 0; i < 9; i++) {
            if(i % 2 == 0) {
                temp = 2*arr[i];
                if(temp >= 10) {
                    checkSum = checkSum + 1 + (temp - 10);
                }
                else {
                    checkSum = checkSum + temp;
                }
            }
            else {
                checkSum = checkSum + arr[i];
            }
        }
        controlNumber = 10 - checkSum % 10;
        if(controlNumber == 10) {
            controlNumber = 0;
        }
        return controlNumber;
    }
}