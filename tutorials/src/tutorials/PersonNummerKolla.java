package tutorials;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.6
 */
public class PersonNummerKolla {

    public static void main(String[] args) {
        String pnr = "0703263418"; //byt ut mot "YYMMDDXXXX"
        if (isPnrLegal(pnr)) {
            System.out.println("Giltligt!");
        } else {
            System.out.println("Ogiltligt!");
        }

    }

    public static long createLegalPersonNum(long num){
        long numLegal = 1111111111;
        return numLegal;
    }


    public static boolean isPnrLegal(String s) {
        System.out.println("s :"+s);
        //skapa en array för personnummer
        int[] pnr = stringToArray(s);
        System.out.println("pnr :"+pnr[0]);
        int control = calculateControlNumber(pnr);
        return pnr[pnr.length-1] == control;
    }

    private static int[] stringToArray(String s) {
        int arr[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
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
