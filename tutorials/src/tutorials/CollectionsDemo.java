package tutorials;

import java.util.*;


public class CollectionsDemo {

    public static void main(String args[]) {
        // create an array list
        //  ArrayList al = new ArrayList();


        // add elements to the array list

        //ayList al = new ArrayList();
        List<String> al = new ArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("");
        al.add(1, "A2");
        System.out.println("Initial size of al: " + al.size());
        setNullValues(al, 1,7);
        System.out.println("Size of al after additions: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);
        // Remove elements from the array list
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }

    protected static void setNullValues(List<String> row, int... indexes) {
        for (int index : indexes) {
            if (row.get(index).isEmpty()) {
                row.set(index, "null");
            }
        }
    }

}
