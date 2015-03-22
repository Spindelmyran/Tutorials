package tutorials;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.10
 */
public class Substring {

    public static void main(String[] args) {
        String st1 = "58709989810";
        String subSt1 = st1.substring(st1.length()-1,st1.length());
        System.out.println(subSt1);
    }
}
