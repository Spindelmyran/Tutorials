package part15;

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Tony";
        person1.age = 100;
        person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years to retirement: " + years);
        int age = person1.getAge();
        String name = person1.getName();
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);


    }
}
