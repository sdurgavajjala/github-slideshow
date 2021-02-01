package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class hashTable {
    public static void main(String[] args) {
        //Stores the data on the basis of Hash Code (key-value)
        //It is synchronized - thread safe. At a time only one thread can access the HashTable.
        //key is an object. Every object has a unique hash code.
        //Java provides a hash code to every object (32 bit signed integer), provided by JVM
        //Two equal  objects return the same hash code number.

        Hashtable h1 = new Hashtable();
        h1.put(1,"Santosh");
        h1.put(2, "Prabhakar");
        h1.put(3,"Sandeep");

        //Create a clone of h1
        Hashtable h = new Hashtable();
        //h will have all the values as that of h1
        h = (Hashtable) h1.clone();

//        Hashtable h2 = new Hashtable();
//        h2 = (Hashtable) h1.clone();

        System.out.println("Values from h1"+h1);
        System.out.println("Values from h2"+h);

        //Clear the values
        h1.clear();
//
//
        System.out.println("Values from h1"+h1);
        System.out.println("Values from h2"+h);
//
        //Contains Value
        Hashtable st = new Hashtable();
        st.put("A","Santosh");
        st.put("B","QA Lead");
        st.put("C","Selenium");

        if (st.containsValue("Santosh"))
            System.out.println("Exists");
//
//        //Iterate through HashTable - Enumeration - elements
        Enumeration e = st.elements();
        System.out.println("Print valued from st using enumeration");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
//
        //get all the values from Entry Set - set of hash table values
        System.out.println("Print valued from st using Entry Set");

        Set s = st.entrySet();
        System.out.println(s);
//
        Hashtable st1 = new Hashtable();
        st1.put("A","Santosh");
        st1.put("B","QA Lead");
        st1.put("C","Selenium");
        st1.put("C","Selenium"); //It contains only unique values
//
//        //no null key and no null values
//        st1.put(null,"Selenium"); //Throws Null Pointer Exception
//
//        st1.put("D",null); //Throws Null Pointer Exception

        System.out.println("Values of st1"+st1);
//
        if (st.equals(st1)){
            System.out.println("both are equal");
        }
//
//        //Get the value from key
        System.out.println(st1.get("A"));
//
//        //Get the hash code of has table object
        System.out.println(st1.hashCode());
        System.out.println(st.hashCode());
//
//        //Generics
//
        Hashtable<String, String> st3 = new Hashtable<String, String>();

    }
}
