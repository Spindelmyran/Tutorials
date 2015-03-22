package tryRemove;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.8
 */
public class Machine {
    private static int count = 0;
    public  int countO = 0;
    public Machine(){
        System.out.println("Machine created");
        count ++;
        if (count > 6){
            System.out.println("Ten");
        }

    }
    public void addToCountO(){
        countO++;
    }
    public int getCount(){
        return count;
    }
    private int getCountO(){
        return countO;
    }
    public void startMachine(){
        while(count < 1111111) {
            System.out.println("Count is: " + count);
            try {
                Thread.sleep(10000); // Wait 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
        }
    }



}
