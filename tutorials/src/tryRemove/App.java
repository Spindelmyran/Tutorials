package tryRemove;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.8
 */
public class App {
    public static void main(String args[]){
        Machine mach1 = new Machine();
        Machine mach2 = new Machine();
        Machine mach3 = new Machine();
        Machine mach4 = new Machine();

        System.out.println("mach1 count: "+mach1.getCount()+" countO: "+mach1.countO);
        System.out.println("mach4 count: "+mach4.getCount()+" countO: "+mach4.countO);
        mach1.addToCountO();
        System.out.println("mach1 count: "+mach1.getCount()+" countO: "+mach1.countO);
        System.out.println("mach4 count: "+mach4.getCount()+" countO: "+mach4.countO);

        mach1.startMachine();
        mach4.startMachine();
    }
}
