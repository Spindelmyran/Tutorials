
package interfaces;

public class Machine implements Info,IStartable {
     
    private int id = 7;
     
    public void start() {
        System.out.println("Machine started.");
    }
 
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }

    @Override
    public void stop() {
    System.out.println("Machine stopped.");
    }
}
