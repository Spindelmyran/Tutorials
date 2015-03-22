package tutorials.codeproject.observerPattern;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.11
 */
public class Person implements Observer{

    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void update(String availabiliy) {

        System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart");
    }

    public void tell(String availabiliy) {

        System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart i tell");
    }
}
