package tutorials.codingbat;

class PosNegCheck {

    public boolean psg(int a, int b, boolean negative) {
       if (!negative) {
           return ((a < 0 && b > 0) || (b < 0 && a > 0)); 
            }
        else{
                return (a < 0 && b < 0);
        }  
    }
}
   
public class PosNeg {


    public static void main(String[] args) {
        PosNegCheck psg = new PosNegCheck();
        System.out.println("psg: " + psg.psg(-4, -5, true));
    }

}
