package constructors;


public class Engine {

    private String name;
    private int code;

    public Engine() {
        this("Arnie", 0);
        System.out.println("Constructor running!");
    }

    public Engine(String name) {
        this(name, 0);

        System.out.println("Second constructor running");
        this.name =name;
    }

    public Engine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }    
}
