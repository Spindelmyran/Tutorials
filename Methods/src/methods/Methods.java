package methods;

class Robot {

    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance) {
        System.err.println("Moving " + distance + " metres in " + direction);
    }
}

public class Methods {

    public static void main(String[] args) {
        Robot sam = new Robot();

        sam.speak("Hi Im Sam");
        sam.jump(7);
        sam.move("west", 12.2);
        String greeting = "Hello there.";
        sam.speak(greeting);
        int value = 14;
        sam.jump(value);
    }

}
