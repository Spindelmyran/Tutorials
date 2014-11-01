package tutorials;

class Person {
// Instance variables(data or "state")

    String name;
    int age;

    // classes can contain
    // 1. Data
    // 2. Subroutines (methods)
    void speak(){
        for(int i=0;i<3;i++){
        System.out.println("My name is: "+name+" and i am "+age+" years old ");
        }
    }
};

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        System.out.println(person1.name);
        System.out.println(person2.age);
    }
}
