package tutorials.codeproject.observerPattern;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.11
 */
public class ObserverPatternMain {
    public static void main(String[] args) {
        Person arpitPerson=new Person("Arpit");
        Person johnPerson=new Person("John");

        Product samsungMobile=new Product("Samsung", "Mobile", "Not available");

        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed
        samsungMobile.registerObserver(arpitPerson);
        samsungMobile.registerObserver(johnPerson);

        //Now product is available
        samsungMobile.setAvailability("Available");

        samsungMobile.removeObserver(arpitPerson);
        Person tonyandersson=new Person("Tony");
        samsungMobile.registerObserver(tonyandersson);
        //Now product is available
        samsungMobile.setAvailability("Not available");

    }
}
