package part14;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.8
 */
class Person {
    String name;
    int age;

    public Person() {
    }

    void speak(){
        for(int i=0; i<3; i++){
            System.out.println("My name is: "+name+" and my age is: "+age);
        }
    }

    void sayHello(){
        System.out.println("Hello there!");
    }

}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Tony";
        person1.age = 100;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Ester";
        person2.age = 8;
        person2.speak();
        person2.sayHello();

    }
}
