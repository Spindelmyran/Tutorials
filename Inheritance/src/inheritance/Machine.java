
package inheritance;

public class Machine {
    
    public Machine(){
    System.out.println("Constructor running!");    
    }

     
    protected String name = "Machine Type 1";
     
    public void start() {
        System.out.println("Machine started.");
    }
     
    public void stop() {
        System.out.println("Machine stopped.");
    }
}
