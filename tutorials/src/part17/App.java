package part17;

class Frog {
 /*   private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }*/
}

public class App {
    public static void main(String[] args) {
        /*Frog frog1 = new Frog();
        frog1.setName("Bertil");
        frog1.setAge(1);
        System.out.println(frog1.getName());*/
        App app1 = new App();
        System.out.println("toString() "+app1.toString());
        System.out.println("hashCode() "+app1.hashCode());
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();
        System.out.println("toString() "+frog1.toString());
        System.out.println("hashCode() "+frog1.hashCode());
        System.out.println("toString() "+frog2.toString());
        System.out.println("hashCode() "+frog2.hashCode());


    }
}
