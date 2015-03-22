package tutorials;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo
{

    public static void main(String args[])
    {
        Set set = new HashSet();

        //Adding values to the HashSet
        set.add("test1:ett");
        set.add("test2:två");
        set.add("test3:tre");

        System.out.println("Retrieving values from HashSet using Iterator");
        retrieveValuesFromListMethod1(set);
        System.out.println("**********************\n\n");

        System.out.println("Retrieving values from HashSet using Enumeration");
        retrieveValuesFromListMethod2(set);
        System.out.println("**********************\n\n");

    }


    /*This method retrieves values from HashSet using Iterator
     */
    public static void retrieveValuesFromListMethod1(Set set)
    {
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next().toString().substring(itr.next().toString().indexOf(":")+1,itr.next().toString().length()));
        }
    }



    /*This method retrieves values from HashSet using Enumeration
     */
    public static void retrieveValuesFromListMethod2(Set set)
    {
        Enumeration e = Collections.enumeration(set);
        while(e.hasMoreElements())
        {
            //System.out.println(e.nextElement());
            Object x = e.nextElement();
            System.out.println( x.toString().indexOf(":")-1  );
            System.out.println(x.toString().substring(0, x.toString().indexOf(":")));
            if( x.toString().substring(0,x.toString().indexOf(":")).equals("test2")) {
                System.out.println(x.toString().substring(x.toString().indexOf(":") + 1, x.toString().length()));
            }
        }

    }

}
